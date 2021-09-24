package problems

import java.util.Scanner

fun main(args: Array<String>) {
    data class Carne(var nome: String, var number: Int)

    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        val numeroCarnes: Int = ler.nextInt()
        val carnes = ArrayList<Carne>()
        for (i in 0 until numeroCarnes) {
            val nome = ler.next()
            val validade = ler.nextInt()
            carnes.add(Carne(nome, validade))
        }

        println(carnes.sortedBy { o: Carne -> o.number }.joinToString(" ") { carne -> carne.nome })
    }
}

/*
URI Online Judge | 2633
Churras no Yuri
Por Matheus Pimenta, UNB BR Brazil

Timelimit: 1
Yuri é um bom companheiro. Sempre fazemos o churras dos “manos ;)” na casa dele! Desta vez, o motivo do churrasco é que os manos estão ﬁnalmente começando a passar em bons concursos! Então, hoje teremos aquela edição especial do churras, with alcohol and futebol de sabão!

A empresa do futebol de sabão está demorando para encher o campo e Yuri, já entendiado, começou a viajar na seguinte pergunta: se assássemos as carnes por ordem da data de validade, qual seria a sequência de peças de carne resultante? Como o MacBook de Yuri está muito longe (e a preguiça está muito perto), ele pediu a sua ajuda para responder esta pergunta.

Entrada
A entrada é composta por vários casos de teste e termina com ﬁm de arquivo. A primeira linha de um caso de teste contém um inteiro N (0 ≤ N ≤ 10), que é o número de peças de carne do churrasco de hoje. Em seguida virão N linhas, cada uma com uma cadeia de no máximo 20 caracteres, com apenas caracteres de ‘a’ a ‘z’, e um inteiro Di (0 ≤ Di ≤ 50) que representa a data de validade da i-ésima peça. Yuri resolveu colaborar e calcular ao menos este número Di de dias até a data de validade, a partir de hoje, de cada peça de carne. É garantido que se i != j, então Di != Dj .

Saída
Para cada caso de teste, imprima uma única linha com a sequência de peças de carne que Yuri quer calcular. Cada peça deve estar separada por um único espaço.

Exemplo de Entrada	Exemplo de Saída
3

picanha 15

coracao 14

maminha 37

4

alcatra 17

linguica 13

asinha 5

pernil 23

coracao picanha maminha

asinha linguica alcatra pernil

Maratona de Programação UnB/CIC 2015.
 */