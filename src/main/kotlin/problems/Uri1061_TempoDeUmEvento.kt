package problems


import java.time.Duration
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val dataInicial = pegarData(ler)
    val dataFinal = pegarData(ler)

    val duracao = Duration.between(dataInicial, dataFinal)
    val data = LocalDateTime.ofEpochSecond(duracao.seconds, 0, ZoneOffset.UTC)
    println("${data.dayOfMonth - 1} dia(s)")
    println("${data.hour} hora(s)")
    println("${data.minute} minuto(s)")
    println("${data.second} segundo(s)")
}

private fun pegarData(ler: Scanner): LocalDateTime {
    ler.next()
    val diaInicial = ler.nextInt()
    val horaInicial = ler.nextInt()
    ler.next()
    val minutoInicial = ler.nextInt()
    ler.next()
    val segundoInicial = ler.nextInt()

    return LocalDateTime.of(2020, 4, diaInicial, horaInicial, minutoInicial, segundoInicial)
}

/*
URI Online Judge | 1061
Tempo de um Evento
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

Exemplo de Entrada	Exemplo de Saída
Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23

3 dia(s)
22 hora(s)
1 minuto(s)
0 segundo(s)
 */