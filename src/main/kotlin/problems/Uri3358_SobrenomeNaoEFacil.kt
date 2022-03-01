package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val vogais = setOf('a', 'e', 'i', 'o', 'u')

    for (caso in 1..ler.nextInt()) {
        val palavra = ler.next()
        var contador = 0

        for (caractere in palavra) {
            if (vogais.contains(caractere.toLowerCase()))
                contador = 0
            else if (contador == 2) {
                contador++
                break
            } else contador++
        }
        if (contador < 3)
            println("$palavra eh facil")
        else println("$palavra nao eh facil")
    }
}

/*
beecrowd | 3358
Sobrenome Não é Fácil
Por Ricardo J. Pfitscher, UNISOCIESC BR Brazil

Timelimit: 1
A região sul do Brasil é caracterizada pela ascendência multicultural de seus habitantes, sendo principalmente europeus e sobretudo italianos, alemães e poloneses. Uma consequência interessante disso é a variação na dificuldade na pronúncia dos sobrenomes da população, o que as vezes dificulta a vida dos professores na realização da chamada de sua turma, gerando até situações constrangedoras. Dada a possibilidade de constrangimento em suas aulas, a professora Jiraiya decidiu pesquisar os sobrenomes em sua lista de chamadas. Na concepção de Jiraiya, um sobrenome é difícil se tiver três ou mais consoantes consecutivas.

Entrada
A entrada contém vários casos de teste. A primeira linha possui um inteiro N que indica o número de casos de teste. Cada caso de teste consiste em um sobrenome. A string contém letras do alfabeto sem acentos, a primeira letra está sempre em maiúscula e o sobrenome pode ter no máximo 42 caracteres.

Saída
Para cada caso de entrada, imprima o sobrenome e se é fácil ou não, conforme mostra o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
6
Ferrari
Bianchi
Hoffmann
Hofmann
Lewandowski
Nowak

Ferrari eh facil
Bianchi nao eh facil
Hoffmann nao eh facil
Hofmann eh facil
Lewandowski nao eh facil
Nowak eh facil

1a Maratona de Programação do Sul
 */