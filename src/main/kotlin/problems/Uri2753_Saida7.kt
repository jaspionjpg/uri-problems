package problems

fun main(args: Array<String>) {
    for (i in 97 until 97 + 26) {
        println("$i e ${i.toChar()}")
    }
}

/*
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

Crie vinte e seis variáveis inteira;
Atribua a primeira variável o valor 97;
Atribua as outras demais variável o valor da primeira somado de uma unidade;
Mostre na tela os valores numéricos da primeira variável, um espaço em braco, o carácter 'e', outro espaço em branco e o seu valor alfanumérico (caracteres);
Repita o procedimento para todas as outras variáveis.
Entrada
Não há.

Saída
O resultado de seu programa deve ser o mesmo do exemplo de saída.

Exemplo de Entrada	Exemplo de Saída
97 e a
98 e b
99 e c
100 e d
101 e e
102 e f
103 e g
104 e h
105 e i
106 e j
107 e k
108 e l
109 e m
110 e n
111 e o
112 e p
113 e q
114 e r
115 e s
116 e t
117 e u
118 e v
119 e w
120 e x
121 e y
122 e z
 */