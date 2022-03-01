package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextLine()) {
        val linha = ler.nextLine().split(" ")
        val nnomes = linha[0].toInt()

        val mapa = HashMap<String, Int>()

        var contador = 0

        for (index in 0 until nnomes) {
            val nome = ler.nextLine()
            val inicias: String = pegarLetrasInicias(nome)
            if (mapa.contains(inicias))
                contador++
            else mapa.put(inicias, 0)
        }

        println(contador)
    }

}

private fun pegarLetrasInicias(nome: String): String {
    var iniciais = ""
    var pegarProxima = true
    for (index in 0 until nome.length) {
        if (nome[index] == ' ')
            pegarProxima = true
        else if (pegarProxima) {
            iniciais += nome[index]
            pegarProxima = false
        }

    }

    return iniciais
}

/*
beecrowd | 2549
Nomes de Usuários
Por Flávio Zavan, UFPR BR Brazil

Timelimit: 1
Vasya e Petya trabalham na secretaria do curso de Bacharelado em Criação de Carangueijos (BCC) na Universidade Física de Praia Rasa (UFPR). Todo ano eles recebem N calouros os quais devem receber credenciais de acesso ao sistema de seleção de carangueijos.

Cada aluno recebe um nome de usuário baseado no seu nome completo. A geração do nome de usuário consiste em concatenar todas as primeiras letras das palavras do nome completo do calouro junto do ano de ingresso no curso. Por exemplo, se Fulano de Tal entrar no curso em 1998, seu nome de usuário será fdt1998.

Os problemas acontecem quando mais de um aluno deveria ter o mesmo nome de usuário. Para estes casos, um dos alunos recebe um nome de usuário padrão enquanto os outros recebem um fora do padrão.

Como este ano ingressaram muitos calouros no curso, Vasya e Petya pediram sua ajuda para escrever um programa que dado o nome de todos os alunos e o ano atual, calcule quantos alunos receberão nomes de usuário fora do padrão.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros N (1 ≤ N ≤ 5×104) e A (1 ≤ A ≤ 9999), a quantidade de calouros e o ano atual, respectivamente.

As N linhas seguintes contém os nomes dos alunos, os quais são representados com até 100 caracteres contendo apenas espaços e letras minúsculas com pelo menos uma letra.

A entrada termina com fim-de-arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha com o número de alunos que receberão um nome de usuário fora do padrão.

Exemplo de Entrada	Exemplo de Saída
10 1998
fulano de tal
cirardo vatares iloveira
    frederico  dilson    teves
glauber leite
gimo laerte gomes
gerson
antovo matadouro    silva do rego
clovis varins ito
crevo   vigrgula inova
basse nordgren

3

18o Treino UFPR
 */