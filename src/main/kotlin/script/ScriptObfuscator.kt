package script

import utils.CommandUtils
import utils.RandomVariableGenerator

object ScriptObfuscator {

    fun obfuscate(command: String): ScriptTemplate {
        val (orderedNames, statements) = CommandUtils.chunkAndRandomize(command)

        val setCommand = generateSetCommand()
        val setVariableName = setCommand.variableName

        val leadingLines = mutableListOf<String>().apply {
            add("@echo off")
            add(generateDelayedExecutionString())
            addAll(setCommand.lines)
            addAll(statements.map { "!$setVariableName! $it" })
        }

        return ScriptTemplate(
            leadingLines = leadingLines,
            variableNames = orderedNames,
        )
    }

    private fun generateDelayedExecutionString(): String {
        val command = "setlocal enabledelayedexpansion"
        var result = ""

        command.forEach {
            result += "%${RandomVariableGenerator.generateVariableName()}%$it%${
                RandomVariableGenerator.generateVariableName()
            }%"
        }

        return result
    }

    private fun generateSetCommand(): SetCommand {
        val variableName = RandomVariableGenerator.generateVariableName()
        val (nameS, statementS) = RandomVariableGenerator.generateVariable("s")
        val (nameT, statementT) = RandomVariableGenerator.generateVariable("t")
        return SetCommand(
            listOf(
                "set $statementS",
                "set $statementT",
                "set \"$variableName=!$nameS!e!$nameT!\"",
            ),
            variableName
        )
    }

    private data class SetCommand(
        val lines: List<String>,
        val variableName: String,
    )
}
