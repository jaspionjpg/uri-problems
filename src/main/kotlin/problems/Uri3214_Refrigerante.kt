package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val garrafasTim = ler.nextInt()
    val garrafasEncontradas = ler.nextInt()
    val garrafasNecessarias = ler.nextInt()

    var totalGarrafasTrocadas = 0

    var garrafasATrocar = garrafasTim + garrafasEncontradas

    while (garrafasATrocar >= garrafasNecessarias) {
        val resto = garrafasATrocar % garrafasNecessarias
        garrafasATrocar /= garrafasNecessarias
        totalGarrafasTrocadas += garrafasATrocar
        garrafasATrocar += resto
    }

    println(totalGarrafasTrocadas)
}

/*
beecrowd | 3214
Refrigerante
Por Andreas Björklund FI Finland

Timelimit: 1
Tim é um bebedor de refrigerante absolutamento obsessivo, ele simplesmente não consegue o suficiente. Mais irritantemente porém, ele quase nunca tem dinheiro, então sua única forma legal mais óbvia de obter mais refrigerante é pegar o dinheiro que ele recebe quando recicla garrafas vazias de refrigerante para comprar novas. Para adicionar com as garrafas resultantes de seu próprio consumo, ele às vezes encontra garrafas vazias na rua. Um dia ele estava com muita sede, então ele realmente bebeu refrigerantes até que ele não pudesse pagar um novo.

Entrada
A entrada cosiste de três inteiros não negativos E, F, C, onde E < 1000 é igual ao número de garrafas de refrigerante vazias na posse de Tim no ínicio do dia, F < 1000 é o número de garrafas de refrigerante vazias encontradas durante o dia, e 1 < C < 2000 é o número de garrafas fazias necessárias para comprar um novo refrigerante.

Saída
Quantos refrigerantes Tim bebeu em seu dia de muita sede?

Exemplos de Entrada	Exemplos de Saída
9 0 3

4

5 5 2

9

Nordic Collegiate Programming Contest 2009
 */