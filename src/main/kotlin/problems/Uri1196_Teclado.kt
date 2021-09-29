package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val teclado = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./   "
    while (ler.hasNextLine()) {
        val frase = ler.nextLine()

        var fraseCorreta = ""
        for (char in frase) {
            val index = teclado.lastIndexOf(char) - 1
            fraseCorreta += teclado[index]
        }

        println(fraseCorreta)
    }
}

/*
URI Online Judge | 1196
WERTYU
Por Gordon V. Cormack  Canadá

Timelimit: 1



Um erro comum de digitação é colocar as mãos no teclado uma posição à direita da correta posição. Desta forma, "Q" é digitado como "W" e "J" é digitado como "K" e assim por diante. Você deve decodificar a mensagem desta maneira.

Entrada
A entrada consiste em várias linhas de texto. Cada linha pode conter dígitos, espaços e letras maiúsculas. (exceto Q, A, Z), ou pontuação, exceto crase (`) conforme mostrado acima. Teclas rotuladas como palavras [Tab, BackSp, Control, etc.] não são representados na entrada. Você deverá repassar cada letra ou símbolo de pontuação pelo símbolo imediatamente à esquerda. Os espaços de entrada simplesmente deverão ser ecoados (impressos) na saída.

Saída
Para cada linha de entrada, imprima uma linha de saída correspondente com a mensagem decodificada.

Exemplo de Entrada	Exemplo de Saída
O S, GOMR YPFSU/

I AM FINE TODAY.

Entradas e saídas por Neilor.
 */