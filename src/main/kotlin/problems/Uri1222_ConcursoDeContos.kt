package problems

import java.util.Scanner;

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextInt()) {
        val palavras: Int = ler.nextInt()
        val linhas: Int = ler.nextInt()
        val tamanhaPorLinha: Int = ler.nextInt()

        var pagina = 1
        var linhaAtual = 1
        var caracteresNaLinha = 0

        for (i in 0 until palavras) {
            val palavra: String = ler.next()
            if (caracteresNaLinha + palavra.length > tamanhaPorLinha) {
                if (linhas == linhaAtual) {
                    linhaAtual = 1
                    pagina++
                } else {
                    linhaAtual++
                }
                caracteresNaLinha = palavra.length + 1
            } else {
                caracteresNaLinha += palavra.length + 1
            }
        }
        println(pagina)
    }
}

/*
URI Online Judge | 1222
Concurso de Contos
Maratona de Programação da SBC  Brasil

Timelimit: 1
Machado gosta muito de escrever. Já escreveu muitos contos, resenhas, relatos de viagens que fez, além de um pequeno romance. Agora Machado quer participar de um concurso de contos, que tem regras muito rígidas sobre o formato de submissão do conto. As regras do concurso especificam o número máximo de caracteres por linha, o número máximo de linhas por página, além de limitar o número total de páginas. Adicionalmente, cada palavra deve ser escrita integralmente em uma linha (ou seja, a palavra não pode ser separada silabicamente em duas linhas). Machado quer escrever um conto com o maior número de palavras possível, dentro das regras do concurso, e precisa de sua ajuda. Dados o número máximo de caracteres por linha, o número máximo de linhas por página, e as palavras do conto que Machado está escrevendo, ele quer saber o número mínimo de páginas que seu conto utilizaria seguindo as regras do concurso.

Entrada
A primeira linha de um caso de teste contém três inteiros N (2 ≤ N ≤ 1000), L (1 ≤ L ≤ 30 ) e C (1 ≤ C ≤ 70) , que indicam, respectivamente, o número de palavras do conto de Machado, o número máximo de linhas por página e o número máximo de caracteres por linha. O conto de Machado é inovador e não contém nenhum caractere além de letras maiúsculas e minúsculas e espaços em branco, sem letras acentuadas e sem cedilha. A segunda linha contém o conto de Machado, composto de N palavras (1 ≤ comprimento de cada palavra ≤ C) separadas por espaços em branco; há espaço em branco somente entre duas palavras, e entre duas palavras há exatamente um espaço em branco. O final da entrada é determinado pelo final de arquivo (EOF).

Saída
Para cada caso de teste imprima uma única linha, contendo um único número inteiro, indicando o número mínimo de páginas que o conto de Machado ocupa, considerando as regras do concurso.

Exemplo de Entrada	Exemplo de Saída
14 4 20
Se mana Piedade tem casado com Quincas Borba apenas me daria uma esperanca colateral
16 3 30
No dia seguinte entrou a dizer de mim nomes feios e acabou alcunhando me Dom Casmurro
5 2 2
a de i de o
5 2 2
a e i o u

2
1
3
3

 */