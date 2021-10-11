package problems

import java.time.LocalDate
import java.util.Scanner
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val data1 = LocalDate.parse(ler.next())
        val data2 = LocalDate.parse(ler.next())

        println((data1.toEpochDay() - data2.toEpochDay()).absoluteValue)
    }
}

/*
URI Online Judge | 1619
Diferença entre Datas
Por Henrique Pinto, UFMG BR Brazil

Timelimit: 1
Joana está trabalhando na nova versão do blog de sua empresa. Uma das coisas que ela quer mudar é a forma como as datas são mostradas no blog. Na versão atual, as datas são mostradas como ano-mês-dia (por exemplo, 2014-05-23).

Ela deseja que, em vez disso, seja mostrado o número de dias que se passaram desde a publicação do post até hoje (por exemplo, se hoje é 9 de agosto de 2014, então a data 2014-05-23 seria mostrada como "78 dias atrás" e a data 2014-08-07 seria "2 dias atrás").

Joana está ocupada com alguns problemas mais complexos relacionados ao blog e pediu que você a ajudasse com essa parte. Dadas duas datas, calcule o número de dias que se passaram entre elas.

Observações

Tome cuidado com anos bissextos (que possuem o dia 29 de fevereiro, e, portanto, 366 dias no total). Um ano é bissexto se seu número é um múltiplo de 400 ou se é um múltiplo de 4, mas não de 100.

Entrada
A entrada começa com uma linha contendo um único inteiro N, que representa o número de casos de teste (0 < N ≤ 10000).

Em seguida, há N linhas, cada uma descrevendo um caso de teste.

Cada uma dessas linhas possui duas datas separadas por um espaço.

As datas estão no formado AAAA-MM-DD, onde AAAA é o ano, MM é o mês, e DD é o dia. Você pode supor que todas as datas são válidas (i.e., nãoo existem datas como 2013-02-31 na entrada). Todas as datas estãoo entre 1970 e 2014 (inclusive). Mês e dia são sempre dados com dois dí­gitos; 3 de fevereiro de 2014 é representado como 2014-02-03.

Saída
Para cada caso de teste, imprima uma linha contendo apenas o valor absoluto do número de dias entre as duas datas.

Exemplo de Entrada	Exemplo de Saída
4

2014-07-27 2014-07-25

2014-08-09 2014-05-23

2012-01-01 2013-01-01

1970-01-01 1970-01-01

2

78

366

0

XIV Contest Algar Telecom 2014
 */