package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var raio = ler.nextDouble()
    println("%.2f".format(2 * 3.14 * raio))
}

/*
beecrowd | 3146
Charadas no Escuro
Por Samuel Eduardo da Silva, IFSULDEMINAS/UFF BR Brazil

Timelimit: 1
Muitas coisas aconteceram desde o início da jornada de Bilbo, Gandalf e os anões. Enquanto passavam pelas Montanhas Enevoadas, Bilbo se separou de seus amigos e acabou indo parar na caverna de Gollum.

Bilbo então encontra um anel e percebe que este anel pertencia a Gollum, pois este, está desesperado atrás dele, porém Bilbo sente algo vindo do anel e guarda-o para si. Gollum fica desconfiado, e propõe a Bilbo um jogo de charadas, e caso Bilbo perdesse, teria seu fim ali mesmo. Bilbo se vê obrigado aceitar o jogo.

Gollum apesar de ser uma criatura desprezível, é muito bom em matemática, então propõe a Bilbo uma pergunta envolvendo circunferência de círculos (já pensando em seu anel). Bilbo está com medo de não conseguir resolver a charada, então quebrou a quarta parede e está pedindo para que você crie um algoritmo que dado o raio R do círculo retorne o tamanho total da circunferência.

            Ah, e Gollum disse: “Pode considerar o valor de pi como 3.14, preciooooso”.

Entrada
Um valor real R indicando o tamanho do raio do círculo da pergunta de Gollum.

Limites:

            0 < R <= 10;

Saída
Um valor real com duas casas decimais indicando o tamanho total da circunferência do círculo da pergunta de Gollum.

Exemplos de Entrada	Exemplos de Saída
1.00

6.28

3.11

19.53

X Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2020
 */