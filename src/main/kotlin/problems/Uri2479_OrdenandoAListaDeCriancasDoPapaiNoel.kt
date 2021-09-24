package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroNomes = ler.nextInt()
    val nomes = ArrayList<String>()
    var comportados = 0

    for (i in 0 until numeroNomes) {
        val comportamento: String = ler.next()
        if (comportamento == "+")
            comportados++
        nomes.add(ler.next())
    }
    nomes.sorted().forEach { nome -> println(nome) }
    println("Se comportaram: " + comportados + " | Nao se comportaram: " + (numeroNomes - comportados))
}

/*
URI Online Judge | 2479
Ordenando a Lista de Crianças do Papai Noel
Por Cristian J. Ambrosi, URI BR Brazil

Timelimit: 1
Papai Noel está nos preparativos finais para a entrega dos presentes para as crianças do mundo todo pois o natal está chegando mais uma vez. Olhando suas novas listas de crianças que irão ganhar presentes neste ano ele percebeu que o duende estagiário (que havia ficado responsável por fazer as listas) não havia colocado os nomes em ordem alfabética.

Como o Papai Noel é um homem muito organizado ele deseja que cada lista de crianças possua, no seu final, o total de crianças que foram bem comportadas neste ano e um total das que não foram. Assim ele pode comparar a quantidade de crianças que se comportam este ano com as dos anos anteriores.

Para ajudar o bom velhinho, seu dever é criar um programa que leia todos os nomes da lista e imprima os mesmos nomes em ordem alfabética. No final da lista, você deve imprimir o total de crianças que foram e não foram comportadas neste ano.

Entrada
A entrada é composta por vários nomes. O primeiro valor N (0 ≤ N ≤ 100), indica quantos nomes tem na lista. As N linhas seguintes, contem um caracter especial correspondente ao comportamento da criança (+ indica que a criança foi bem comportada, - indica que a criança não foi bem comportada). Após o caracter especial, segue o nome da criança com no máximo 20 caracteres.

Saída
Para cada lista de crianças, você deve imprimir os nomes em ordem alfabética. Após imprimir os nomes das crianças, você deve mostrar o total de crianças que se comportaram bem ou mal durante o ano.

Exemplos de Entrada	Exemplos de Saída
16
+ Tininha
+ Dudinha
- Carlinhos
- Marquinhos
+ Joaozinho
+ Bruninha
- Leandrinho
- Fernandinha
+ Rafinha
- Pedrinho
+ Aninha
- Tamirinha
- Gaguinho
- Zezinho
- Luquinhas
+ Julhinha

Aninha
Bruninha
Carlinhos
Dudinha
Fernandinha
Gaguinho
Joaozinho
Julhinha
Leandrinho
Luquinhas
Marquinhos
Pedrinho
Rafinha
Tamirinha
Tininha
Zezinho

Se comportaram: 7 | Nao se comportaram: 9

10
+ Zezinho
+ Mangojatinha
+ Bruninha
- Joaozinho
- Fernandinha
+ Aninha
- Luquinhas
+ Pedrinho
- Tininha
- Marquinhos

Aninha
Bruninha
Fernandinha
Joaozinho
Luquinhas
Mangojatinha
Marquinhos
Pedrinho
Tininha
Zezinho

Se comportaram: 5 | Nao se comportaram: 5

15
+ Joaozinho
- Fernandinha
+ Bruninha
+ Pedrinho
- Zezinho
+ Mangojatinha
- Marquinhos
+ Carlinhos
+ Aninha
- Luquinhas
+ Rafinha
+ Leandrinho
- Tamirinha
+ Julhinha
+ Gaguinho

Aninha
Bruninha
Carlinhos
Fernandinha
Gaguinho
Joaozinho
Julhinha
Leandrinho
Luquinhas
Mangojatinha
Marquinhos
Pedrinho
Rafinha
Tamirinha
Zezinho

Se comportaram: 10 | Nao se comportaram: 5

Contest de Natal 2016.
 */