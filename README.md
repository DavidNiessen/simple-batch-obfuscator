# Simple Bat Obfuscator

**Disclaimer: This project is for educational purposes only!!!**

This program creates an obfuscated batch script that executes a command.

### TODO

- encrypt and decrypt payload at runtime using base64 or AES
- create CLI
- write tests
- add more configuration options

before:

```shell
@echo off & setlocal enabledelayedexpansion & set /a num=10 & set "str=Start" & for /l %%i in (1,1,10) do (set /a num+=%%i & set "str=!str!_%%i" & echo Iteration %%i, Num=!num!, String=!str!) & echo Final Value: !num! & echo Final String: !str! & echo Done Processing! & pause
```

after:

```shell
@echo off
%yWTkMyVULwDpDVUDlpXlcTHbwZFGggxV%s%uEEcRqSuzMJNorRplQdTBffGJaxiWDFC%%cXagxsZDrklLswllwmrLRBmuTanoxyZQ%e%DOiuCZtqopCngZxKLZxdKEcHaYdiqvpJ%%TVdPsNAugrHNTtMCzmhmbbpNvphHdQRT%t%cbdiLZJlqJncZCdMptzkdgJoWvFnpJpN%%LnzOsOWXAQKJHNnNodhOQEIenEQrJMmH%l%HMBkMskESoFiUCDClFkquIbdWMuITrAH%%YZiryfmXvifflVQDkSFHrHxBJBsiTXWA%o%RwwwCHAxVXUByXTsPKlbWpYOPkCzHyLW%%DqTWyZRItxclfXSVQYvAzEXvRwYfDxuM%c%bnojccTLBRDReubQBIGTfBCgSXroHGco%%IAqoqhwsODfGhAzLLYokMcBhYhagKolr%a%kVTNELmZsXragdNFnLThtsuymwzClMVM%%QumCEEUYPnPeZWHivfIsHAVpicqpwwjH%l%anxGOTvUAFagMCWkbUwKbTBDHUYqtYrr%%ixnZWMIPQrIQmVanQnGZujruoslOxCtq% %NdIwYcQYOghyuJjuRXKkRwHhWeHhfvnA%%sCTJqczTWUQIodvwBAiDtEoOxzAFvPNH%e%iCXGfxLOEfTzLLaPmRFWUnwlNtQQtMje%%PifihVdNfDuXuLbfkBVKNtFKFilYHlGr%n%xPRnszTjTxqxwxXxsfhCsGRoDHYcmXHW%%NssIvoSmlkobepKJXmkfTqSkkcqIDStz%a%pOTllddIJtqFXXVzHXuzdYBTpcQiMkuE%%qevOgqDiMqxzCTBFIMMGjhwuncfOoaDu%b%AYyUbYmllHyFHUWUdrGwjvSPvZpsWGMx%%qIVepNGuzZSuqhIhjpooxGGviPHqvyDB%l%gJqJlFujwPStTsNKNsGRsQrRHqOYPJQp%%XnsAWHxctOQAJfqcHDXggqGluaZLalrQ%e%qHDCGHeusIcqdGfgnIdKurecfxulvIjP%%vWBcxVwoqptvEkomghemEtGIMpbYasAD%d%kBBwvvcSQVoWJxHggnDlwBntSGlfkPpL%%VSXVvyhyfrkbOCllGvwBjnjCbXviqkJD%e%YBDqIWocCMnWDZpudesZAefuzKjQfORF%%LrhGzhhJxThUsntIldzQiQSrXmwPgMMF%l%UrwYabDcQYwTjwfDGacUGEWkTsyCqhTq%%dXZnteczFaOrkJNCtYOBOwlacSYtYhEE%a%yhrUKUYViSeMGdPXdRmylhjUTlJMtlYp%%YkDmiGImZgNmhKDqhMRuhJSHSJteWqUF%y%MwDzFTiVAipTRKiXtpiygYMwdvFOhLJM%%EmmKRLTsYkmdrBiENuBvKPCZHXtVJQnv%e%dWinwIpSkaNwQLIQlYoxcPpZOMdcVNov%%nIFBQLvfadSSoJqCntiArNStsEIausKN%d%eWTNrGCSrMysrsxOHDYSnjfxGnXsVXPc%%cAWgTOJfoYwBLOcfzGHBLkFhAoBEftXm%e%sLRFwgKqOKOfHaDiuoEoMWLXJvEEjVhr%%tMyezfubsPsmEMMbaZCbgVjlfIHlURzz%x%vDUeavwEdsjHrMQoUNGeizRvuTWtGsiL%%ztfeLFxCWSvuMFgeQPfejDVogBibYLLN%p%CmfWWxVeaAWFnIuCjVxLWhILXaVIDfEc%%cgnYKhcgrwxFQCkUCjKBRTpbnicJchTC%a%pKafJdqKnaaEtajTDqLGsgywpvQnRYaB%%EmimBWHzKpNapMzQEtRIbzKgSBviisuw%n%THcneYMqMoLKrfJFanjrVByxRCgDkqWy%%xrGgptFANAZOmJVTQhKECHzuEsEUQZSH%s%YbMioRfeAXjSlulojOCEGfsnLkuTKYQc%%cGqDToxFiaWlKiSkVcZUplRbDJODcVIr%i%gnSSEqwbKGZYPTcQfXGKoHVbLeLVKSyD%%twKBKvJkStDSIzfVwFGGbLSHrMohcWKq%o%NCVLNxmuiEPCvosRREoWJIyjxXndEWXo%%ulqLhXZQQjclEcUsyzgkasQKDafVhkLc%n%tcpwvmtroBYWBmOhGeUDtykzpmkNfLUi%
set "mfkhBMyMzelJKzJMbuGlCYPKmnIpeqvs=s"
set "jefJYsdBrswoUgumpSJwJsICgBBhaZOR=t"
set "kzhrfrgUxeqqiBuJQqotavlMvepDBUIk=!mfkhBMyMzelJKzJMbuGlCYPKmnIpeqvs!e!jefJYsdBrswoUgumpSJwJsICgBBhaZOR!"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "ISuUzijoGyZoPoZSAoLjFDouDQJZEOlx=!_%%i""
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "ReghGvXosIwNKucQdsYyfIKMODdkUpsv=Done P"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "NeqxbSmhYMyByLBONkmcElyBscpmTjcq=rocess"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "qUhguegcluOQOTNXKGhBiWOASduUAVBX=bledel"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "FdKrnBFFAzNYFMCPYLHhQgZTfiwKsGsx=r=!str"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "hqMdcDPyfkgKoMjSylfUnTkNEtZXSMCG=off & "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "IHYRfLAtQQKbAdoXkNwfeQTjVRvVYtTQ=um=!nu"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "CVNacvGJbfmJHrCppYuefUIQUMCeglHk= echo "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "gRFZpjDDFcEbYZzftUtCmnGEClSThzgx=al ena"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "rNKgQVNsIavnJcIcTIRCNkqtotTcMVlU=%%i, N"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "CItOHfcfEeOKBhNdibKSeubjjdJoDNmq=: !num"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "qnnHcwDUGaCmZuZYewJABqPHkFoYbihl=um=10 "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "NlpsOBUzYlDBYZnKECtKTjTCstelldzE=,1,10)"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "szwtBuMiLntbQIWIanEaBpjroQesHSva=setloc"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "MqVNsCBBWlIhyXNIvMUDZoecUYdVIoXE=et "st"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "FbHnEvsNevVFqgckCULTcjJxzkRemGvd=str!) "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "mtqYnLRPqsGUTTaXDDRCBQRQAzUEsJuc=! & ec"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "IZbfoNlHZtNLqXFkKQgSXzFAlWggtSUA=n & se"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "HoxIJkhRNmoLgotxcyYsrXnbZeRDjotw=ing! &"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "UHSPKBEhnMlZLsELLvuecRuepUvThBge= do (s"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "spwqdVlPTcGRbeSpDAyZOAIQqkSrGqUB=& set "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "hvcUCJbFkEsQgZdKIaQWgIZEPynqixvH=pansio"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "hzikOtWdoIqQAvvIYfStTtFHiwFOgQEU=ho Fin"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "XnyRYZyDMWiEmJJdPvApsroKgYoAMMnx= Final"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "NBwyRTmrFVxFeXOdIIkiTEQpHWmgoJct=al Str"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "dzzUhZlpjgMucqfRxNTkUIwjlXGpRjHv=ation "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "WJQrbHcBieBOasCpLsiObLVEvrBaEuqs=tart" "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "lGQbPaQsRMJvUvCzEQqSdyiTDdkmkGlR=num+=%"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "hgZtnUBPlDLwkhSwzXKaYOCoGbsdSQgg= in (1"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "IlRXOVtMZqTWrDEBUZedNWpJtQWskNji= & ech"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "YjgdgfoLsEGSBPYCHhEhBdAobvXJGHaM=& for "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "ZrEPbNnzLOvOdgQJaarodQOTIzeOLrth="str=S"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "LvyveHlcqEyMbpKcEbPLEsfegKMdLBXX=%i & s"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "pxkkaeOwetFOFCEiAnsdAxAdbrNDoFZf=t /a n"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "YrigOSteQucVRXcyvsHrOmubNrLMEgZo= Value"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "EgsGFbQWUIKgnjZoJTbxoWSZUhOslWfv=ayedex"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "cbVBYjbOHKbPvWcAtCGzhSvNnSyZVJlk=et /a "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "rGFbWHSepJPmWcwmljAiHQPhpdWsmpTl=str! &"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "kflHqfzoGcWxzqkpszVataxjgVryLGXG=ring=!"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "qQSQaWDKhTRBtaUWQAbeCaqgloLxwsrh=@echo "
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "PBUpkcjWFnQIiqBwvEQEKkzwXmlnDIUj= pause"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "JEECXDjqgCQnxGypyTnkhkISXBDIVwvf=& echo"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "mzXsTbVvLpPopAvwEskBywRVwcVzItgD=/l %%i"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "femKGivohXjjPGdVcSdkicHOmcNyzQyN=ing: !"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "GpfKMcoGshQiumindXWcnubzEMAWWglD=m!, St"
!kzhrfrgUxeqqiBuJQqotavlMvepDBUIk! "tXGVENcWyqOLZGJXJxKkXnjEuPKZTXaD=o Iter"
%qQSQaWDKhTRBtaUWQAbeCaqgloLxwsrh%%hqMdcDPyfkgKoMjSylfUnTkNEtZXSMCG%%szwtBuMiLntbQIWIanEaBpjroQesHSva%%gRFZpjDDFcEbYZzftUtCmnGEClSThzgx%%qUhguegcluOQOTNXKGhBiWOASduUAVBX%%EgsGFbQWUIKgnjZoJTbxoWSZUhOslWfv%%hvcUCJbFkEsQgZdKIaQWgIZEPynqixvH%%IZbfoNlHZtNLqXFkKQgSXzFAlWggtSUA%%pxkkaeOwetFOFCEiAnsdAxAdbrNDoFZf%%qnnHcwDUGaCmZuZYewJABqPHkFoYbihl%%spwqdVlPTcGRbeSpDAyZOAIQqkSrGqUB%%ZrEPbNnzLOvOdgQJaarodQOTIzeOLrth%%WJQrbHcBieBOasCpLsiObLVEvrBaEuqs%%YjgdgfoLsEGSBPYCHhEhBdAobvXJGHaM%%mzXsTbVvLpPopAvwEskBywRVwcVzItgD%%hgZtnUBPlDLwkhSwzXKaYOCoGbsdSQgg%%NlpsOBUzYlDBYZnKECtKTjTCstelldzE%%UHSPKBEhnMlZLsELLvuecRuepUvThBge%%cbVBYjbOHKbPvWcAtCGzhSvNnSyZVJlk%%lGQbPaQsRMJvUvCzEQqSdyiTDdkmkGlR%%LvyveHlcqEyMbpKcEbPLEsfegKMdLBXX%%MqVNsCBBWlIhyXNIvMUDZoecUYdVIoXE%%FdKrnBFFAzNYFMCPYLHhQgZTfiwKsGsx%%ISuUzijoGyZoPoZSAoLjFDouDQJZEOlx%%IlRXOVtMZqTWrDEBUZedNWpJtQWskNji%%tXGVENcWyqOLZGJXJxKkXnjEuPKZTXaD%%dzzUhZlpjgMucqfRxNTkUIwjlXGpRjHv%%rNKgQVNsIavnJcIcTIRCNkqtotTcMVlU%%IHYRfLAtQQKbAdoXkNwfeQTjVRvVYtTQ%%GpfKMcoGshQiumindXWcnubzEMAWWglD%%kflHqfzoGcWxzqkpszVataxjgVryLGXG%%FbHnEvsNevVFqgckCULTcjJxzkRemGvd%%JEECXDjqgCQnxGypyTnkhkISXBDIVwvf%%XnyRYZyDMWiEmJJdPvApsroKgYoAMMnx%%YrigOSteQucVRXcyvsHrOmubNrLMEgZo%%CItOHfcfEeOKBhNdibKSeubjjdJoDNmq%%mtqYnLRPqsGUTTaXDDRCBQRQAzUEsJuc%%hzikOtWdoIqQAvvIYfStTtFHiwFOgQEU%%NBwyRTmrFVxFeXOdIIkiTEQpHWmgoJct%%femKGivohXjjPGdVcSdkicHOmcNyzQyN%%rGFbWHSepJPmWcwmljAiHQPhpdWsmpTl%%CVNacvGJbfmJHrCppYuefUIQUMCeglHk%%ReghGvXosIwNKucQdsYyfIKMODdkUpsv%%NeqxbSmhYMyByLBONkmcElyBscpmTjcq%%HoxIJkhRNmoLgotxcyYsrXnbZeRDjotw%%PBUpkcjWFnQIiqBwvEQEKkzwXmlnDIUj%
```
