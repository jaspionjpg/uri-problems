package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    println("---------------------------------------")
    println("|  decimal  |  octal  |  Hexadecimal  |")
    println("---------------------------------------")
    println("|      0    |    0    |       0       |")
    println("|      1    |    1    |       1       |")
    println("|      2    |    2    |       2       |")
    println("|      3    |    3    |       3       |")
    println("|      4    |    4    |       4       |")
    println("|      5    |    5    |       5       |")
    println("|      6    |    6    |       6       |")
    println("|      7    |    7    |       7       |")
    println("|      8    |   10    |       8       |")
    println("|      9    |   11    |       9       |")
    println("|     10    |   12    |       A       |")
    println("|     11    |   13    |       B       |")
    println("|     12    |   14    |       C       |")
    println("|     13    |   15    |       D       |")
    println("|     14    |   16    |       E       |")
    println("|     15    |   17    |       F       |")
    println("---------------------------------------")
}

/*
URI Online Judge | 2750
Saída 4
Por Roberto A. Costa Jr, UNIFEI BR Brazil

Timelimit: 1
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

Criar 16 variáveis inteiras;
Atribuir a elas valores de 0 a 15 a cada um das variáveis anteriores;
Ter 39 traços (-) na primeira linha;
Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da primeira linha, embaixo do 4o traço deve começar a escrever “decimal”, embaixo do 16o traço deve começar a escrever “octal”, embaixo do 26o traço deve começar a escrever “Hexadecimal” e o restante preencher com espaço em branco;
Repita o procedimento 1;
Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da primeira linha, embaixo do 8o traço deve imprimir o valor da primeira variável em valor decimal, embaixo do 18o traço deve imprimir o valor da primeira variável em valor octal, embaixo do 31o traço deve imprimir o valor da primeira variável em valor hexadecimal e o restante preencher com espaço em branco;
Repita o procedimento 6 para as outras 15 variáveis;
Repita o procedimento 1.
No final deve ficar igual a imagem a seguir:

--------------------------------------- (39 traços)
| decimal   |  octal  |  Hexadecimal  |
---------------------------------------
|      0    |    0    |       0       |
|      1    |    1    |       1       |
|      2    |    2    |       2       |
|      3    |    3    |       3       |
|      4    |    4    |       4       |
|      5    |    5    |       5       |
|      6    |    6    |       6       |
|      7    |    7    |       7       |
|      8    |   10    |       8       |
|      9    |   11    |       9       |
|     10    |   12    |       A       |
|     11    |   13    |       B       |
|     12    |   14    |       C       |
|     13    |   15    |       D       |
|     14    |   16    |       E       |
|     15    |   17    |       F       |
--------------------------------------- (39 traços)
Entrada
Não há.

Saída
A saída será impressa conforme a figura acima.

Exemplo de Entrada	Exemplo de Saída
---------------------------------------
| decimal   |  octal  |  Hexadecimal  |
---------------------------------------
|      0    |    0    |       0       |
|      1    |    1    |       1       |
|      2    |    2    |       2       |
|      3    |    3    |       3       |
|      4    |    4    |       4       |
|      5    |    5    |       5       |
|      6    |    6    |       6       |
|      7    |    7    |       7       |
|      8    |   10    |       8       |
|      9    |   11    |       9       |
|     10    |   12    |       A       |
|     11    |   13    |       B       |
|     12    |   14    |       C       |
|     13    |   15    |       D       |
|     14    |   16    |       E       |
|     15    |   17    |       F       |
---------------------------------------
 */