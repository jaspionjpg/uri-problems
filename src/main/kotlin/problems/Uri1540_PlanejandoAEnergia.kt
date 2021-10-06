package problems

import java.math.RoundingMode
import java.util.Locale
import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()

    for (teste in 1..testes) {
        val anoinicial = ler.nextDouble()
        val energiainicial = ler.nextDouble()

        val anofinal = ler.nextDouble()
        val energiafinal = ler.nextDouble()

        val diferencaporano = (energiafinal - energiainicial) / (anofinal - anoinicial)

        println(diferencaporano.toBigDecimal().setScale(2, RoundingMode.FLOOR).toString().replace(".", ","))
    }
}

/*
URI Online Judge | 1540
Planejando a Energia
Por Normandes Jr, UFU BR Brazil

Timelimit: 1
Você está participando de um comitê que irá ajudar a planejar o crescimento da energia elétrica no Brasil, garantindo assim que as usinas consigam fornecer a energia necessária no futuro.

Para isso você tem as seguintes informações:

durante o ano de 2010 o consumo médio do brasileiro foi de 104.326 GWh.
em 2013 o consumo foi de 127.755 GWh.
Você deve determinar a taxa de crescimento anual para diferentes situações e previsões futuras, considerando o fato deste crescimento ser linear. Nesse caso, a taxa foi de 7.809,66 GWh/ano.

Entrada
A primeira linha da entrada contém um número inteiro N (1 ≤ N ≤ 1000) representando o total de casos de testes.

As N linhas seguintes são compostas de 4 números inteiros A, B (B > 0), C, D (D > 0) separados por espaço. O número A representa o ano, o número B representa o consumo do ano A. O número C representa um outro ano e o número D representa o consumo de C.

Saída
Para cada caso de teste deverá ser impresso a taxa de crescimento anual com apenas duas casas decimais, separadas por vírgula e truncadas, ou seja, sem arredondamentos.

Exemplo de Entrada	Exemplo de Saída
1
2010 104326 2013 127755

7809,66

Maratona Algar Telecom XIII
 */