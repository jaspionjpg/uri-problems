package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    val listaConversoes = mapOf("dec" to 10, "hex" to 16, "bin" to 2)

    for (teste in 1..testes) {
        val numero = ler.next()
        val tipo = ler.next()
        val numeroConvertido = Integer.valueOf(numero, listaConversoes[tipo]!!)

        println("Case $teste:")
        for ((operador, numero) in listaConversoes)
            if (operador != tipo)
                println("${Integer.toString(numeroConvertido, numero)} $operador")
        println()
    }
}

/*
URI Online Judge | 1193
Conversão entre Bases
Por Neilor Tonin, URI  Brasil

Timelimit: 3
O professor de matemática de Juliano marcou uma prova cujo conteúdo será apenas conversão entre valores decimais, hexadecimais e binários. Uma das coisas mais complexas para Juliano é fazer estas conversões de base entre números. Por mais que estude, tem muita dificuldade para entender. Portanto, como você entende de computação e é amigo(a) de Juliano, ele solicitou a tua ajuda para que faça um programa que verifique se as conversões feitas por ele estão correta.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir, um por linha. Cada caso de teste contém um valor X (X > 0) seguido de um texto Y com três caracteres, indicando se o valor X está no formato binário, decimal ou hexadecimal. Independente do formato, qualquer dos números deverá caber em um inteiro de 32 bits.

Saída
Para cada caso de teste, você deve apresentar o número de caso de teste seguido por duas linhas, que contém a conversão do valor fornecido para as outras duas bases. A sequência das bases de saída será sempre: decimal, hexadecimal (em minúsculo) e binário, ou seja deve-se respeitar esta ordem excluindo obviamente o formato de entrada.

Obs: deverá ser impressa uma linha em branco após cada caso de teste, inclusive após o último caso de teste.

Exemplo de Entrada	Exemplo de Saída
3
101 bin
101 dec
8f hex

Case 1:
5 dec
5 hex

Case 2:
65 hex
1100101 bin

Case 3:
143 dec
10001111 bin

 */