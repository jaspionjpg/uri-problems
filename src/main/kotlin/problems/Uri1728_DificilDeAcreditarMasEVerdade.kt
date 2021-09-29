package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (true) {
        val sentenca = ler.next()
        if (sentenca == "0+0=0"){
            println("True")
            break
        }
        var (num1, num2, resultado) = sentenca.split(Regex("[+=]"))

        if (num1.reversed().toInt() + num2.reversed().toInt() == resultado.reversed().toInt())
            println("True")
        else println("False")
    }
}

/*
URI Online Judge | 1728
Difícil de Acreditar, Mas é Verdade!
University of Ulm local Contest DE Germany

Timelimit: 1
A briga continua para decidir se é melhor armazenar números começando pelos seus dígitos mais significativos ou pelos seus dígitos menos significativos. Às vezes ela é chamada de "Endian War". Essa batalha teve início há muito tempo atrás, nos primórdios da Ciência da Computação. Joe Stoy, em seu (a propósito, excelente) livro "Denotational Semantics" ("Semântica Denotacional"), conta a história a seguir:

"A decisão sobre para que lado escrevermos os dígitos é, claro, matematicamente trivial. Entretanto, um dos primeiros computadores britânicos tinha números escritos da direita para a esquerda (porque o feixe de luz de um tubo de osciloscópio vai da direita para a esquerda, mas na lógica serial trata-se primeiro dos dígitos menos significativos). Turing costumava confundir seu público em palestras públicas quando, por acaso, ele entrava neste modo mesmo para aritmética decimal, e escrevia coisas como 73+42=16. A versão seguinte da máquina foi tornada mais convencional simplesmente invertendo os fios da deflexão no eixo X: isso, porém, preocupou os engenheiros, já que suas formas de onda ficaram todas ao contrário. Esse problema, por sua vez, foi resolvido criando uma pequena janela para que os engenheiros (que tendiam a ficar atrás do computador mesmo) pudessem ver a tela do osciloscópio de trás.
[C.Strachey - comunicação privada.]"

Você vai fazer o papel do público e julgar se as equações de Turing são verdadeiras.

Entrada
A entrada contém vários casos de teste. Cada caso especifica em uma única linha uma equação de Turing. Uma equação de Turing tem a forma "a+b=c", onde a, b, c são números compostos de dígitos 0,...,9. Cada número consiste de, no máximo, 7 dígitos. Isso inclui possíveis zeros à esquerda ou à direita. A equação "0+0=0" terminará a entrada e deve ser processada também. As equações não contêm espaços.

Saída
Para cada caso de teste gere uma linha contendo a palavra "True" ou a palavra "False", se a equação é verdadeira ou falsa, respectivamente, na interpretação de Turing, ou seja, com os números escritos de trás para frente.

Exemplo de Entrada	Exemplo de Saída
73+42=16
5+8=13
10+20=30
0001000+000200=00030
1234+5=1239
1+0=0
7000+8000=51
0+0=0
True
False
True
True
False
False
True
True
University of Ulm local Contest 2001/2002.
 */