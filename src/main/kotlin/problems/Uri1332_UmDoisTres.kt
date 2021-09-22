package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDePalavras = ler.nextInt()
    for (i in 0 until numeroDePalavras) {
        val palavra = ler.next()
        if (palavra.length == 5)
            println("3")
        else if (palavra[0] == 'o' && palavra[1] == 'n' ||
            palavra[0] == 'o' && palavra[2] == 'e' ||
            palavra[1] == 'n' && palavra[2] == 'e'
        ) println("1")
        else println("2")
    }
}

/*
URI Online Judge | 1332
Um-Dois-Três
Por Rujia Liu  China

Timelimit: 1
Seu irmão mais novo aprendeu a escrever apenas um, dois e três, em Inglês. Ele escreveu muitas dessas palavras em um papel e a sua tarefa é reconhecê-las. Nota-se que o seu irmão mais novo é apenas uma criança, então ele pode fazer pequenos erros: para cada palavra, pode haver, no máximo, uma letra errada. O comprimento de palavra é sempre correto. É garantido que cada palavra que ele escreveu é em letras minúsculas, e cada palavra que ele escreveu tem uma interpretação única.

Entrada
A primeira linha contém o número de palavras que o seu irmão mais novo escreveu. Cada uma das linhas seguintes contém uma única palavra com todas as letras em minúsculo. As palavras satisfazem as restrições acima: no máximo uma letra poderia estar errada, mas o comprimento da palavra está sempre correto. Haverá, no máximo, 1000 palavras de entrada.

Saída
Para cada caso de teste, imprima o valor numérico da palavra.

Exemplo de Entrada	Exemplo de Saída
3
owe
too
theee

1
2
3

Agradecimento especial: Yiming Li; Jane Alam Jan.
 */