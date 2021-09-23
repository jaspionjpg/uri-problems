package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numero: String = ler.next()
    println(numero.reversed())
}

/*
URI Online Judge | 1984
O Enigma do Pronalândia
Por Victor Jatobá, UNIME BR Brazil

Timelimit: 1
Os cientistas da NASA descobriram um novo exoplaneta que fica a 1 bilhão de anos luz da terra. O nome desse planeta foi batizado de Pronalândia em homenagem aos novos cientistas que estão sendo formados no PRONATEC. Só que o mais incrível ainda está por vir. Ao observar melhor o planeta eles conseguiram identificar que os habitantes da Pronalândia estavam querendo se comunicar por uma numeração. Só que a numeração que encontraram está invertida e como encontraram muitas delas chamaram você para conseguir automatizar esse processo. Logo, dado um número grande, sua tarefa é imprimir esse número invertido.

Entrada
O arquivo contém apenas uma linha de teste que é o número encontrado (0 < n < 9999999999).

Obs.: Perceba que o número lido é muito alto para armazenar em uma variável do tipo int, logo você irá precisar utilizar o tipo long, que para a leitura e impressão em C, você deve utilizar o %llu.

Saída
Imprimir o número lido invertido. Não esqueça de imprimir a quebra de linha (\n) no final, caso contrário você receberá (Presentation Error).

Exemplo de Entrada	Exemplo de Saída
1234

4321

9876543210

0123456789

12

21

I Seletiva MaratonaTEC - Maratona de Programação PRONATEC - UNIME
 */