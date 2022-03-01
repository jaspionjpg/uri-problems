package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    for (caso in 1..ler.nextInt()) {
        val senha = ler.next()
        try {

            val senhaNumerica = senha.substring(2).toLong()

            if (senha.length != 20 || !senha.startsWith("RA"))
                println("INVALID DATA")
            else
                println(senhaNumerica)
        } catch (ex: NumberFormatException) {
            println("INVALID DATA")
        }
    }
}

/*
beecrowd | 2714
Minha Senha Provisória
Por , Silva A. M. BR Brazil

Timelimit: 1
Uma instituição de ensino lisboeta tem como prática para atribuição de senha de acesso ao portal acadêmico utilizar o RA (registro acadêmico) do aluno. Nesta instituição os RA's são strings de 20 caracteres iniciados sempre pelos caracteres "RA" e seguidos por 18 dígitos numéricos. por exemplo: RA000000000000012340. Estes identificadores são gerados automaticamente pelo sistema de matrículas e são formados por três partes principais: (a) iniciados pelos caracteres "RA", (b) seguidos por Z digitos zeros formatadores de posição (onde, 0 <= Z <= 17), e por fim, (c) o número identificador do aluno propriamente dito, considerando os X números mais a direita do RA não iniciados por zero (onde, 1 <= X <= 18).


Entrada
A primeira linha de entrada é um valor inteiro N (onde, 1 <= N <= 1000) que representa a quantidade de RA's que deve ser considerada pelo programa. As N seguintes linhas representam, cada uma, strings, de no máximo 100 caracteres, que representam os RA's enviados pelo sistema de matrícula.


Saída
As saídas válidas para o programa são: a apresentação da senha provisória ou a indicação de "INVALID DATA". A senha provisória é formada pelos X caracteres númericos não iniciados em 0 mais a direita da string, por exemplo: para o identificador "RA000000000000012340" a senha provisória deve ser "12340". Caso a string recebida não esteja de acordo com as regras de formação, o programa deve indicar "INVALID DATA".


Exemplos de Entrada	Exemplos de Saída
7
RA000000000000000001
RA000000000000000100
RA000000000000012345
RA123456789012345678
ra000000000000000333
RA12345
12345678901234567890


1
100
12345
123456789012345678
INVALID DATA
INVALID DATA
INVALID DATA

*Amsilva copyright (2017), for use (authorized) in the URI OJ. All rights reserved.
 */