package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val testes = ler.nextInt()
    for (i in 0 until testes) {

        val numeroAlunos = ler.nextInt()
        val alunos = ArrayList<String>()
        for (j in 0 until numeroAlunos) {
            val aluno = ler.next()
            alunos.add(aluno)
        }
        val alunosReprovados = ArrayList<String>()
        for (j in 0 until numeroAlunos) {
            val presenca = ler.next()

            var presencas = 0
            var faltas = 0

            for (indice in presenca.indices) {
                if (presenca[indice] == 'P')
                    presencas++
                else if (presenca[indice] == 'A')
                    faltas++
            }

            if (presencas.toDouble() / (presencas + faltas) < 0.75) {
                alunosReprovados.add(alunos[j])
            }
        }
        println(alunosReprovados.joinToString(" "))
    }
}

/*
URI Online Judge | 1277
Pouca Frequência
Por TopCoder*  EUA

Timelimit: 1
Os estudantes da tua universidade recentemente adquiriram o desagradável hábito de cabular as aulas. Para enfrentar este problema o seu Conselho de Professores decidiu somente permitir que estudantes com ao menos 75% de presença prestem os exames. A partir de uma lista de nomes de estudantes e seus respectivos registros de frequência, imprima o nome dos estudantes que não obtiveram o mínimo de presença às aulas e que consequentemente não poderão prestar os exames.

Entrada
A entrada possui diversos casos de testes. A primeira linha da entrada contém um inteiro T, que indica o número de casos de testes que se seguem.

Cada caso de teste é composto por três linhas:

A primeira linha de um caso de teste irá conter um inteiro N (0 ≤ N ≤ 100) que indica o número de estudantes na turma.
A segunda linha conterá N nomes de estudantes com até 50 caracteres cada nome, separados por um único espaço. Todos os nomes irão conter somente letras maiúsculas e minúsculas (‘A’-‘Z’,‘a’-‘z’).
A terceira linha conterá N registros de frequência, correspondentes aos respectivos estudantes da linha anterior. Os registros virão separados por um único espaço, e contêm apenas os caracteres ‘A’, ‘P’ e ‘M’. Um ‘P’ indica que o estudante estava presente à aula, ‘A’ indica que ele estava ausente (ele cabulou à aula) e ‘M’ mostra que, apesar de não ir à aula, ele entregou um atestado médico, então esta aula não deverá ser considerada no cálculo da frequência do estudante. Registros de frequência conterão ao menos um caracter ‘A’ ou ‘P’.
Saída
Para cada caso de teste imprima os nomes de todos os estudantes que não cumpriram a presença mínima requerida, separados por um espaço. Não deixe espaços sobrando no final da linha.

Exemplo de Entrada	Exemplo de Saída
4
1
Justin
PAAPP
2
Justin Chris
PAAPP PPPPA
1
Sunny
PPPAM
4
Mansi Arjun Nikhil Taneja
PPPPMPPAPP AAMAAPP PPPPAAP PPPAAAMPP

Justin
Justin

Arjun Nikhil Taneja

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por bitfreeze para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */