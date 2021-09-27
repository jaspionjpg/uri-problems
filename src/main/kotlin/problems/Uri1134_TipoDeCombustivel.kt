package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val lista = IntArray(3)

    while (true) {
        val tipoCombustivel = ler.nextInt()
        if (tipoCombustivel == 4)
            break
        else if (tipoCombustivel > 4)
            continue
        else
            lista[tipoCombustivel - 1]++
    }

    println("MUITO OBRIGADO")
    println("Alcool: ${lista[0]}")
    println("Gasolina: ${lista[1]}")
    println("Diesel: ${lista[2]}")
}

/*
URI Online Judge | 1134
Tipo de Combustível
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

Exemplo de Entrada	Exemplo de Saída
8
1
7
2
2
4

MUITO OBRIGADO
Alcool: 1
Gasolina: 2
Diesel: 0

Agradecimentos a Cássio F.
 */