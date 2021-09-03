package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    val casosTeste = ler.nextInt()
    for (i in 1..casosTeste) {
        val numeroTomadas = ler.nextInt()
        var somaTomadas = 0
        for (j in 1..numeroTomadas) {
            val filtros = ler.nextInt()
            somaTomadas += filtros
        }
        println(somaTomadas - (numeroTomadas - 1))
    }
}

/*
URI Online Judge | 3209
Tomadas Elétricas
Por Mats Petter Pettersson IS Iceland

Timelimit: 1
Roy acaba de se mudar para um novo apartamento. Bem, na verdade o apartamento em si não é muito novo, remonta aos dias antes das pessoas terem eletricidade em suas casas. Por causa disso, o apartamento de Roy tem apenas uma única tomada, então Roy só pode alimentar um de seus aparelhos elétricos por vez.

Roy gosta de assistir TV enquanto trabalha em seu computador e de ouvir seu sistema HiFi (em alto volume) enquanto aspira, portanto, usar apenas uma única tomada não é uma opção. Na verdade, ele quer ter todos os seus aparelhos conectados a uma tomada elétrica, o tempo todo. A resposta, claro, são réguas de energia, e Roy tem algumas velhas que usou em seu antigo apartamento. No entanto, aquele apartamento tinha muito mais tomadas de parede, então ele não tem certeza se suas réguas de energia fornecerão tomadas suficientes agora.

Sua tarefa é ajudar Roy a calcular quantos aparelhos ele pode fornecer com eletricidade, considerando um conjunto de filtros de linha. Observe que, sem réguas de energia, Roy pode ligar um único aparelho na tomada. Além disso, lembre-se de que um filtro de linha deve ser alimentado por si mesmo para ter alguma utilidade.

Entrada
A entrada vai começar com um único inteiro 1 ≤ N ≤ 20, indicando o número de casos de teste a seguir. Em seguida, seguem N linhas, cada uma descrevendo um caso de teste. Cada caso de teste começa com um inteiro 1 ≤ K ≤ 10, indicando o número de filtros de linha no caso de teste. Em seguida, seguem, na mesma linha, K inteiros separados por espaços simples, O1 O 2 ... OK , onde 2 ≤ Oi ≤ 10, indicando o número de tomadas em cada filtro de linha.

Saída
Imprima uma linha por caso de teste, com o número máximo de aparelhos que podem ser alimentados.

Exemplo de Entrada	Exemplo de Saída
3
3 2 3 4
10 4 4 4 4 4 4 4 4 4 4
4 10 10 10 10

7
31
37

Nordic Collegiate Programming Contest 2005
 */
