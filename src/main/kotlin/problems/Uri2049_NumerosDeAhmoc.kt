package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    var contador = 1
    while (true) {
        val assinatura = ler.nextLine()
        if (assinatura == "0")
            break
        val numero = ler.nextLine()

        if (contador != 1)
            println()

        println("Instancia $contador")
        println(if(numero.contains(assinatura))"verdadeira" else "falsa")
        contador++
    }

}

/*
beecrowd | 2049
Números de Ahmoc
Por IX Maratona de Programação IME-USP, 2005 BR Brazil

Timelimit: 1
Antes da colonização hispânica e depois inglesa, a região de San Antonio era dominada pelos índios ahmoc-axhozupeck, ancestrais dos sioux e dos apaches. A etnia foi completamente destruída pelos colonizadores, no século XVIII, tornando impossível a tarefa de decifrar seus grandes painéis.

O Departamento de Arqueologia da Universidade Baylor dedica boa parte de sua pesquisa aos painéis dos índios Ahmoc. Surpreendentemente os índios já conheciam os algarismos hindus, mas não o usavam para cálculos (afinal não existia comércio naquela civilização). Os arqueólogos de Baylor suspeitam que os painéis repletos de números fossem apenas decorativos. Também suspeitam que alguns padrões que se repetiam eram assinaturas dos artistas, a fim de garantir a autenticidade do painel.

Sua tarefa neste problema será verificar se os painéis são verdadeiros, ou seja, se, de fato, contêm a assinatura do artista que o arqueólogo suspeita ser o autor.

Entrada
São dadas várias instâncias de teste. Cada instância começa com um número inteiro positivo 0 ≤ a ≤ 1000000 que é a assinatura do artista. O inteiro 0 indica o fim dos dados. Na linha seguinte vem a sequência de números do painel, que poderá ter até 300000 algarismos.

Saída
Para cada instância solucionada, você deverá imprimir um identificador "Instancia h" em que h é um número inteiro, sequencial e crescente a partir de 1. Na linha seguinte, você deverá imprimir "verdadeira" se a sequência de números contém a assinatura do artista ou "falsa" em caso contrário. Uma linha em branco deve separar a saída de cada instância.

Exemplo de Entrada	Exemplo de Saída
1234
837384937292379450545045672392303485065402302373543504864694450034302
23034
837384937292379450545045672392303485065402302373543504864694450034302
0

Instancia 1
falsa

Instancia 2
verdadeira

IX Maratona de Programação IME-USP, 2005
 */