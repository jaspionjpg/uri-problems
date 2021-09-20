package problems

fun main(args: Array<String>) {
    var total = 0.0
    for (i in 1..100) {
        total += 1.0 / i
    }
    println("%.2f".format(total))
}

/*
URI Online Judge | 1155
Sequência S
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 1/2 + 1/3 + … + 1/100

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
Agradecimentos a Cassio F.
 */