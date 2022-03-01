package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var consumo = ler.nextInt()

    var custo = 0
    if (consumo > 100) {
        custo += 5 * (consumo - 100)
        consumo = 100
    }

    if (consumo > 30) {
        custo += 2 * (consumo - 30)
        consumo = 30
    }

    if (consumo > 10) {
        custo += 1 * (consumo - 10)
        consumo = 10
    }

    custo += 7
    println(custo)
}

/*
beecrowd | 2369
Conta de Água
Por OBI - Olimpíada Brasileira de Informática 2010 BR Brazil

Timelimit: 1
A empresa local de abastecimento de água, a Saneamento Básico da Cidade (SBC), está promovendo uma campanha de conservação de água, distribuindo cartilhas e promovendo ações demonstrando a importância da água para a vida e para o meio ambiente.

Para incentivar mais ainda a economia de água, a SBC alterou os preços de seu fornecimento de forma que, proporcionalmente, aqueles clientes que consumirem menos água paguem menos pelo metro cúbico. Todo cliente paga mensalmente uma assinatura de R$ 7, que inclui uma franquia de 10 m³ de água. Isto é, para qualquer consumo entre 0 e 10 m³ , o consumidor paga a mesma quantia de R$ 7 reais (note que o valor da assinatura deve ser pago mesmo que o consumidor não tenha consumido água). Acima de 10 m³ cada metro cúbico subsequente tem um valor diferente, dependendo da faixa de consumo. A SBC cobra apenas por quantidades inteiras de metros cúbicos consumidos. A tabela abaixo especifica o preço por metro cúbico para cada faixa de consumo:



Assim, por exemplo, se o consumo foi de 120 m³ , o valor da conta é:

7 reais da assinatura básica;
20 reais pelo consumo no intervalo 11 - 30 m³;
140 reais pelo consumo no intervalo 31 - 100 m³;
100 reais pelo consumo no intervalo 101 - 120 m³.
Logo o valor total da conta de água é R$ 267.

Escreva um programa que, dado o consumo de uma residência em m3, calcula o valor da conta de água daquela residência.

Entrada
A única linha da entrada contém um único inteiro N, indicando o consumo de água da residência, em m³ (0 ≤ N ≤ 10³).

Saída
Seu programa deve imprimir uma única linha, contendo o valor da conta de água daquela residência.

Exemplos de Entrada	Exemplos de Saída
8

7

14

11

42

51

OBI - Olimpíada Brasileira de Informática 2010 Fase 1 Nível 1
 */