package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val palavra = ler.nextLine()
    if (palavra.toLowerCase().contains("zelda"))
        println("Link Bolado")
    else
        println("Link Tranquilo")
}

/*
URI Online Judge | 2651
Link Bolado
Por Abner Samuel P. Palmeira, IFSULDEMINAS BR Brazil

Timelimit: 1
Link é um herói famoso e por isso recebe diversas cartas de seus fãs. Porém mesmo sendo famoso, todos continuam o chamando de Zelda.

Por causa disso Link está muito bolado, tão bolado que sempre que recebe uma carta ele confere como o seu fã se referiu a ele na carta, e caso ele perceba o trecho "zelda" no nome ele fica bolado e joga a carta fora.

Sua tarefa é determinar se Link ficará bolado com a forma que seu fã o chamou na carta ou não.

Entrada
Contém uma string S (1 ≤ |S| ≤ 105) que representa como o fã de Link se referiu a ele na carta. A string é composta apenas por letras maiúsculas e minúsculas.

Saída
Seu programa deve exibir "Link Bolado" caso o nome contenha o trecho "zelda" ou "Link Tranquilo" caso contrário.

Exemplos de Entrada	Exemplos de Saída
zelda

Link Bolado

zeldo

Link Tranquilo

Zeldao

Link Bolado

Aquecimento OLIP 2017
 */