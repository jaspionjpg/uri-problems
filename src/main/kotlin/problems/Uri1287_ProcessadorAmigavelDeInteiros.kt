package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextLine()) {

        val texto = ler.nextLine()
        var numeros = texto.replace("l", "1")
            .replace("o", "0")
            .replace("O", "0")
            .replace(" ", "")
            .replace(",", "")
        try {
            val numero = numeros.toInt()
            if (numero == 2147483647 && numeros.length > 11 && numeros[0] == '0') {
                println("error")
                continue
            }

            println(numero)
        } catch (e: NumberFormatException) {
            println("error")
        }
    }
}

/*
URI Online Judge | 1287
Processador Amigável de Inteiros
Por TopCoder*  EUA

Timelimit: 1
Computadores estão presentes em uma porcentagem significante de casas pelo mundo e, como programadores, somos responsáveis por criar interfaces que todos possam usar. Interfaces de usuário precisam ser flexíveis de forma que se um usuário comete um erro não fatal, a interface ainda pode deduzir o que o usuário queria dizer.

Sua tarefa é escrever um programa que processe um texto de entrada representando um inteiro, porém, como esta é uma interface de usuário, não seremos muito rígidos com o usuário:

1. Se o usuário digita a letra "O" ou "o", assumimos que ele queria digitar o número "0".

2. Se o usuário digita a letra "l", assumimos que ele queria digitar o número "1".

3. Vírgulas e espaços são permitidos, porém não são processados (são ignorados).

Se, mesmo com as regras acima, o usuário não entrou um número não-negativo, imprima a string "error". Overflow (um valor maior que 2147483647) é considerado inválido e "error" deve ser impresso.

Entrada
Cada linha da entrada é um caso de teste e contém uma string n.

n conterá entre 0 e 50, inclusive, letras, dígitos, espaços ou vírgulas

Saída
Para cada caso de teste, seu programa deverá imprimir um inteiro representado pela string n ou "error" se n não é um inteiro não-negativo válido.

Nota: Uma string vazia não representa um inteiro válido.

Exemplo de Entrada	Exemplo de Saída
lo6
234,657

hi
,,,,,5,,5,    4
2200000000
00

106
234657
error
error
554
error
0

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Julio B. para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */
