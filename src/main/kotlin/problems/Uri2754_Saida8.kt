package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    println("234.345000 - 45.698000\n" +
            "234 - 46\n" +
            "234.3 - 45.7\n" +
            "234.34 - 45.70\n" +
            "234.345 - 45.698\n" +
            "2.343450e+02 - 4.569800e+01\n" +
            "2.343450E+02 - 4.569800E+01\n" +
            "234.345 - 45.698\n" +
            "234.345 - 45.698")
}

/*
URI Online Judge | 2754
Saída 8
Por Roberto A. Costa Jr, UNIFEI BR Brazil

Timelimit: 1
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

Crie duas variáveis reais de dupla precisão;
Atribua a primeira o valor 234.345 e a segunda o valor 45.698;
Imprima as duas variáveis com seis casas decimais;
Imprima as duas variáveis sem nenhuma casa decimal;
Imprima as duas variáveis com uma casa decimal;
Imprima as duas variáveis com duas casas decimais;
Imprima as duas variáveis com três casas decimais;
Imprima as duas variáveis com notação cientifica com 'e';
Imprima as duas variáveis com notação cientifica com 'E';
Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
Para imprimir, separe os valores com um espaço em branco, um traço (-) e um espaço em branco.

Entrada
Não há.

Saída
O resultado de seu programa deve ser escrito conforme o exemplo da saída.

Exemplo de Entrada	Exemplo de Saída
234.345000 - 45.698000

234 - 46

234.3 - 45.7

234.34 - 45.70

234.345 - 45.698

2.343450e+02 - 4.569800e+01

2.343450E+02 - 4.569800E+01

234.345 - 45.698

234.345 - 45.698
 */