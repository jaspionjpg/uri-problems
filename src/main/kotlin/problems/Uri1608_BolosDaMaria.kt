package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextInt()
    for (teste in 1..testes) {
        val dinheiro = ler.nextInt()
        val numingredientes = ler.nextInt()
        val tiposbolosdiferentes = ler.nextInt()

        val valoresingredientes = IntArray(numingredientes) { ler.nextInt() }

        val bolosASeremProduzidos = IntArray(tiposbolosdiferentes) {
            val ingredientes = ler.nextInt()
            var valorbolo = 0
            for (i in 1..ingredientes) {
                val indice = ler.nextInt()
                val quantidade = ler.nextInt()
                valorbolo += valoresingredientes[indice] * quantidade
            }
            valorbolo
        }

        val qtbolos = dinheiro / (bolosASeremProduzidos.minOrNull() ?: 0)
        println(qtbolos)
    }
}

/*
URI Online Judge | 1608
Bolos da Maria
Por Fabio Lima, Universidade de São Paulo - São Carlos BR Brazil

Timelimit: 1
Dona Maria é uma senhora que está aposentada e faz doces. Ela começou a fazer bolos para complementar a renda da família.

Para fazer um bolo, Dona Maria precisa de certa quantidade de alguns ingredientes diferentes. Cada ingrediente tem um custo fixo por unidade. Ela tem uma quantia de dinheiro D máxima para gastar na compra dos ingredientes. Dentre os tipos de bolos que existem, você deve escolher apenas um tipo, de maneira a maximizar a quantia de bolos.

Calcule o número máximo de bolos de um único tipo que podem ser confeccionados.

Entrada
Na primeira linha terá um inteiro T (T ≤ 100) indicando o número de casos de teste.

Para cada cada caso de teste, na primeira linha haverá três números inteiros D (1 ≤ D ≤ 109), I (1 ≤ I ≤ 100) e B (1 ≤ B ≤ 100) indicando o dinheiro que Dona Maria tem, o número de ingredientes existentes e a quantidade de tipo de bolos existentes, respectivamente. A próxima linha conterá I números inteiros indicando o preço da unidade de cada ingrediente. Seguem B linhas seguirão descrevendo cada bolo. O i-ésimo bolo é descrito da seguinte maneira: inicialmente há um número Qi (1 ≤ Qi ≤ 100) que indicará quantos ingredientes diferentes serão necessários. Logo em seguida teremos Qi pares de números indicando respectivamente o índice do ingrediente e a quantidade necessária, todos na mesma linha separados por espaços.

A quantia de cada ingrediente em um bolo poderá variar de 1 até 1000. Cada unidade de um ingrediente custará entre 1 e 1000. Os ingredientes na descrição de cada bolo serão diferentes. Os identificadores de ingrediente vão de 0 até I-1.

Saída
Para cada caso imprima o número máximo de bolos do mesmo tipo que podem ser confeccionados.

Exemplo de Entrada	Exemplo de Saída
3
10 2 2
3 4
1 0 2
1 1 1
10 4 3
10 10 10 10
3 0 1 1 1 2 1
2 0 1 1 1
1 3 1
100 5 3
6 5 3 8 9
5 2 3 3 5 1 1 0 10 4 1
3 2 10 0 10 4 2
4 4 1 3 1 0 1 1 1

2

1

3

Seletiva USP São Carlos - Segunda Prova 2014
 */