package problems

fun main(args: Array<String>) {
    var j = 7
    for (i in 1..9 step 2) {
        println("I=$i J=$j")
        println("I=$i J=${j - 1}")
        println("I=$i J=${j - 2}")
        j += 2
    }
}

/*

URI Online Judge | 1097
Sequencia IJ 3
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13
 */