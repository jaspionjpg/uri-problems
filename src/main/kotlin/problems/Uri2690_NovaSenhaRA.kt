package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val testes = ler.nextLine().toInt()

    val mapa = mapOf(
        'G' to 0, 'Q' to 0, 'a' to 0, 'k' to 0, 'u' to 0,
        'I' to 1, 'S' to 1, 'b' to 1, 'l' to 1, 'v' to 1,
        'E' to 2, 'O' to 2, 'Y' to 2, 'c' to 2, 'm' to 2, 'w' to 2,
        'F' to 3, 'P' to 3, 'Z' to 3, 'd' to 3, 'n' to 3, 'x' to 3,
        'J' to 4, 'T' to 4, 'e' to 4, 'o' to 4, 'y' to 4,
        'D' to 5, 'N' to 5, 'X' to 5, 'f' to 5, 'p' to 5, 'z' to 5,
        'A' to 6, 'K' to 6, 'U' to 6, 'g' to 6, 'q' to 6,
        'C' to 7, 'M' to 7, 'W' to 7, 'h' to 7, 'r' to 7,
        'B' to 8, 'L' to 8, 'V' to 8, 'i' to 8, 's' to 8,
        'H' to 9, 'R' to 9, 'j' to 9, 't' to 9
    )

    for (testeAtual in 0 until testes) {
        var linha = ler.nextLine().replace(" ", "")
        var novaSenha = ""
        for (indiceCaractere in 0 until if (linha.length > 12) 12 else linha.length)
            novaSenha += mapa[linha[indiceCaractere]]
        println(novaSenha)
    }
}

/*
URI Online Judge | 2690
Nova Senha RA
Por Samuel Lucas Santos Gomes, IFSULDEMINAS BR Brazil

Timelimit: 1
Um novo conjunto de autenticação será implementado no Instituto Federal do Sul de Minas, campus Muzambinho.

Bom, o novo serviço de autenticação é seguro, sem bugs e dores de cabeça mesmo porque estamos no final de semestre. Ele permitirá que sua senha tenha espaços, mas não números ou caracteres especiais. A atualização ocorre sempre no período de férias, para que todos os ajustes sejam feitos e no final agrade todos os usuarios. Como estagiário da central de suporte da escola, seu dever é implementar a nova autenticação. Por enquanto o novo padrão para nomes de usuários está sendo estudado.



Como podemos perceber para cada conjunto de letras teremos um numero especifico. Bole um programa maroto para fazer essa conversão das letras para os números, e como você não acessará as senhas dos alunos, faça um algoritmo para que o mesmo faça o processo sozinho usando seus proprios casos de teste.

Obs : Seus casos de teste não poderão passar de 20 caracterese e a saída, 12 digitos.

Entrada
Você terá N indicando a quantidade de senhas que serão trocadas, em seguida N casos de testes.

Saída
A saída será uma lista com os novos números, criptografados das senhas que foram digitadas.

Exemplo de Entrada	Exemplo de Saída
3
o rato roeu a roupa de margarida
O Rato Roeu A Roupa de Margarida
OlA TuDo CeRtO

470947440074

290949440694

216405474992

Primeiro contest Sam Well - IFSULDEMINAS
 */