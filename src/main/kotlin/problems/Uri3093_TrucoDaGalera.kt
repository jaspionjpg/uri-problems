package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()
    for (i in 0 until testes) {
        val cartasNoMonte = ler.next()

        val cartasLetras = listOf('Q', 'J', 'K', 'A')
        val temAsTodasAsLetras = cartasNoMonte.toCharArray()
            .distinct()
            .filter { carta -> cartasLetras.contains(carta) }
            .size == 4

        if (temAsTodasAsLetras)
            println("Aaah muleke")
        else println("Ooo raca viu")
    }
}

/*
URI Online Judge | 3093
Truco da Galera 1.0
Por Ygor Ribeiro, IFSULDEMINAS BR Brazil

Timelimit: 1
Truco da Galera é um jogo muito viciante que é jogado pelos estudantes de Computação do IFSULDEMINAS. Não iremos entrar em detalhes de como funciona o jogo e nem iremos falar as regras, uma vez que essas podem variar muito dependendo do grupo de amigos que está jogando. Theusin das novinha e das gameplays, como é conhecido, é muito supersticioso, ele acredita que sempre que perde uma rodada a culpa é das cartas que sobraram no monte depois de serem distribuídas a todos os participantes.

Depois de distribuídas todas as cartas sobram-se várias no monte, a partir disso, Theusin analisa todas as cartas que sobraram e as dispõe sobre a mesa.

Pense em um baralho com cartas de 2 à 7 e {Q, J, K, A} como sendo as carta que fazem parte do jogo. Nesse baralho não estamos preocupados com naipe nem com a quantidade de cartas iguais que podem existir. Assuma que esse baralho pode ter até 1000 cartas no monte mesmo depois que cada participante já pegou as suas.

Exemplo: Depois da distribuição de todas as cartas aos participantes, as que sobraram foram as seguintes, nessa ordem: {2, 5, 8, J, A, A, 7, 3, Q, 4, K}.

Vamos a superstição do garoto: Theusin acredita que sempre que as cartas {Q, J, K, A} estão no monte ele não irá perder pontos na rodada.

Portanto, para as cartas do exemplo acima, nessa rodada Theusin não irá perder pontos, pois as cartas {Q, J, K, A} apareceram, não necessariamente em ordem, mas apareceram, o que é suficiente para que o mestre do fortnite acredite que não perca pontos na rodada.

Entrada
A primeira linha de entrada contém um inteiro N (1 <= N <= 20), que indica a quantidade de casos de teste. As próximas N linhas contém uma String S (1 <= |S| <= 1000), sem espaços, mostrando todas as cartas que ficaram no monte após a distribuição das cartas aos jogadores.

Saída
Para cada linha de caso de teste imprima "Aaah muleke", sem aspas, caso Theusin acredite que não irá perder pontos na rodada, ou "Ooo raca viu", sem aspas, caso ele ache que irá perder, ou seja, sua superstição não ocorra.

Exemplo de Entrada	Exemplo de Saída
3
AJ23456QK
AJ23456Q
QJJJJ754AK

Aaah muleke
Ooo raca viu
Aaah muleke

CONTEST DE FÉRIAS IFSULDEMINAS 2020
 */