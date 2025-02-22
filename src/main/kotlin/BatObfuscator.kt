import script.ScriptObfuscator

fun main() {
    println(
        ScriptObfuscator.obfuscate("@echo off & setlocal enabledelayedexpansion & set /a num=10 & set \"str=Start\" & for /l %%i in (1,1,10) do (set /a num+=%%i & set \"str=!str!_%%i\" & echo Iteration %%i, Num=!num!, String=!str!) & echo Final Value: !num! & echo Final String: !str! & echo Done Processing! & pause")
            .writeAsString()
    )
}
