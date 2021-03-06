package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        val (r, l, j) = ler.next().split(Regex("([+=])"))

        if (!r.last().isDigit())
            println(j.toInt() - l.toInt())
        else if (!l.last().isDigit())
            println(j.toInt() - r.toInt())
        else println(r.toInt() + l.toInt())
    }
}

/*
beecrowd | 2557
R+L=J
Por Ricardo Oliveira, UFPR BR Brazil

Timelimit: 1
Durante sua grande aventura na Terra do Oeste, Joãozinho descobriu um livro sagrado que, segundo as lendas, foi escrito pelos próprios deuses antigos. Uma passagem em particular chamou a atenção do jovem aventureiro:

“A origem daquele que nada sabe se revelará quando aquele escolhido pelos deuses desvendar o enigma por eles lhe imposto. R+L=J.”

O enigma o intrigou bastante. Joãozinho logo começou a procurar por valores de R, L e J que satisfazem a equação citada na passagem. Após investigações, o jovem encontrou dois dos três valores citados. Joãozinho deve agora determinar o terceiro dos valores citados, para que o enigma seja solucionado e para que “a origem daquele que nada sabe” seja revelada.

Entrada
A entrada contém vários casos de teste. A única linha de cada caso contém uma string na forma R+L=J. Se uma variável tem um valor conhecido, tal valor aparece na string no lugar da variável. Caso contrário, a letra que representa a variável aparece normalmente.

É garantido que exatamente dois dos três valores são conhecidos. Além disso, todos os valores conhecidos estão entre 1 e 106, inclusive. Não há zeros à esquerda nos valores dados.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma linha contendo o valor da variável desconhecida.

Exemplo de Entrada	Exemplo de Saída
3+8=J
5+L=5
R+7=5

11
0
-2

6a Seletiva UFPR
 */