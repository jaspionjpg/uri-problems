package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val mapa = mapOf(
        'a' to "2",
        'b' to "22",
        'c' to "222",
        'd' to "3",
        'e' to "33",
        'f' to "333",
        'g' to "4",
        'h' to "44",
        'i' to "444",
        'j' to "5",
        'k' to "55",
        'l' to "555",
        'm' to "6",
        'n' to "66",
        'o' to "666",
        'p' to "7",
        'q' to "77",
        'r' to "777",
        's' to "7777",
        't' to "8",
        'u' to "88",
        'v' to "888",
        'w' to "9",
        'x' to "99",
        'y' to "999",
        'z' to "9999",
        ' ' to "0"
    )

    for (caso in 1..ler.nextLine().toInt()) {
        val palavra = ler.nextLine()

        var ultimaTecla = '-'

        val teclasApertadas = palavra.map {
            val teclas = if (it > 'Z') {
                val tecla = mapa[it]
                if (tecla?.last() == ultimaTecla) "*$tecla"
                else tecla
            } else if (it != ' ') "#${mapa[it.toLowerCase()]}"
            else "0"
            ultimaTecla = teclas!!.last()
            teclas
        }.joinToString("")
        println(teclasApertadas)
    }
}

/*
beecrowd | 3159
Tijolão
Por Aline Regina de Oliveira, IFSULDEMINAS/UFSCAR BR Brazil

Timelimit: 1
Durante essa quarentena Amélia estava lembrando do que gostava de fazer na infância. De maneira nostálgica ela se lembrou do quanto gostava de jogar Snake no celular da sua mãe. Era o famoso 'tijolão', da marca Aikon. Ela até conseguiu encontrar um aplicativo para Android que simulava o joguinho, mas ela começou a se perguntar: "Como eu conseguia escrever mensagens com aquele teclado mesmo?".  Na imagem abaixo tem-se uma foto do celular à esquerda e o detalhe de seu teclado à direita.



tijolao

Ela lembrou como o teclado era utilizado para escrever mensagens. Nesse problema, para simplificar, iremos considerar um celular no idioma inglês (não há acentos).



As teclas de 2 a 9 são usadas para digitar as letras de ‘a’ a ‘z’, e funcionam  assim: se quisermos obter uma das letras associadas a uma das teclas, precisamos pressioná-la um número de vezes igual a posição da letra desejada. Por exemplo, pressionando a tecla 6 uma vez obtemos ‘m’. Se pressionarmos novamente, obteremos ‘n’ e depois ‘o’. Se continuarmos pressionando-a obteremos o número ‘6’ e depois reiniciamos em ‘m’, assim sucessivamente. A tecla 0 é utilizada para inserir espaços na mensagem; a tecla 1 era apenas o dígito '1' e algumas pontuações (que não serão usadas nesse problema) e a tecla # é usada para colocar a próxima letra em maiúsculo, por exemplo, se apertar #2 obteremos 'A', se apertar #27 obteremos 'Ap'.



No caso de termos duas letras consecutivas na mensagem que são formadas pela mesma tecla era necessário esperar um tempinho para continuar digitando, neste problema vamos considerar que  tecla * represente esse intervalo de tempo, ou seja, a função da tecla * no nosso caso é separar as sequências de pressionamentos de duas letras na mesma tecla. Por exemplo, para digitar a palavra ‘cafe’, a sequência de teclas pressionadas seria a seguinte: 222*2333*33. Mas se a segunda letra na mesma tecla for maiúscula não é necessário pressionar ‘*’ pois você terá de pressionar ‘#’ entre elas. Por exemplo, a palavra 'cAfe' corresponde à sequência 222#2333*33.



Como o teclado era bem duro,  Amélia odiava cometer erros, por isso ela quer saber a sequência mínima de teclas que deve apertar para digitar cada mensagem.

Entrada
A primeira linha de cada caso de teste contém um inteiro N (1 <= N <= 666) que representa a quantidade de mensagens que Amélia quer escrever. Cada uma das N linhas seguintes possuem uma frase de 1 a 140 caracteres. As frases serão compostas por espaços e letras minúsculas e maiúsculas sem acentos.

Saída
Para cada frase informada por Amélia você deve mostrar em uma linha a sequência mínima de teclas a serem pressionadas, todas juntas.

Exemplos de Entrada	Exemplos de Saída
4

cAfe

cafe

CAFE

Cafe

222#2333*33

222*2333*33

#222#2#333#33

#222*2333*33

1

Pior que ta nao fica Tiririca

#7444666777077883308206626660333444222*20#8444777444777444222*2

X Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2020
 */