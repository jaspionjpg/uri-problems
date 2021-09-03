package problems

import java.time.LocalDate
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val revolucoes = ler.nextInt()

    val primeiraData = LocalDate.of(2020, 12, 21)
    val anosEmJupiter = 11.9 * revolucoes
    val anosEmSaturno = 29.6 * revolucoes

    val diasEmJupiter = (anosEmJupiter * 365 + anosEmJupiter / 4).toLong()
    val diasEmSaturno = (anosEmSaturno * 365 + anosEmSaturno / 4).toLong()
    println("Dias terrestres para Jupiter = $diasEmJupiter")
    println("Data terrestre para Jupiter: ${primeiraData.plusDays(diasEmJupiter)}")
    println("Dias terrestres para Saturno = $diasEmSaturno")
    println("Data terrestre para Saturno: ${primeiraData.plusDays(diasEmSaturno)}")
}
/*
URI Online Judge | 3173
Estrela de Natal
Por Michele Selivon, URI BR Brazil

Timelimit: 1
Júpiter e Saturno são os maiores planetas do Sistema Solar. Eles estarão alinhados entre os dias 16 e 21 de dezembro de 2020. A distância entre os planetas será ainda menor no dia 21. Essa conjunção é um fenômeno raro conhecido por ‘Estrela do Natal’ ou ‘Estrela de Belém’ e poderá ser visto de vários locais da Terra.

Com base no período orbital (em anos terráqueos - AT) de Júpiter e Saturno, seu código deverá informar a data final das próximas revoluções tomando como ponto inicial o dia 21 de dezembro de 2020 e o número de dias transcorridos.

Considere que Júpiter leva 11,9 AT para completar sua órbita ao redor do Sol e que Saturno leva 29,6 AT. Use valores inteiros para definir o número de dias transcorridos e lembre-se de incluir os dias de anos bissextos.

Entrada
A entrada será um valor inteiro N (0 < N <= 50) equivalente ao número ordinal de revoluções a partir de 21 de dezembro de 2020. Por exemplo, N = 5 corresponde a data de término da quinta revolução em cada um dos dois planetas.

Saída
A saída deverá apresentar o número de dias e das datas (aproximadas) de término da revolução nos planetas Júpiter e Saturno respectivamente. Considere o seguinte formato de data: aaaa – mm – dd

Exemplos de Entrada	Exemplos de Saída
1

Dias terrestres para Jupiter = 4346
Data terrestre para Jupiter: 2032-11-14
Dias terrestres para Saturno = 10811
Data terrestre para Saturno: 2050-07-28

3

Dias terrestres para Jupiter = 13039
Data terrestre para Jupiter: 2056-09-02
Dias terrestres para Saturno = 32434
Data terrestre para Saturno: 2109-10-10

5

Dias terrestres para Jupiter = 21732
Data terrestre para Jupiter: 2080-06-21
Dias terrestres para Saturno = 54057
Data terrestre para Saturno: 2168-12-22
 */