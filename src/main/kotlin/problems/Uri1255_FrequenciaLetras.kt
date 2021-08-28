import java.util.Scanner
import java.util.stream.Collectors

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeTestes = ler.nextInt()
    val texto = ler.nextLine()
    for (i in 1..numeroDeTestes) {
        val texto = ler.nextLine()

        val alfabeto: MutableMap<Char, Int> =
            "abcdefghijklmnopqrstuvwxyz".chars().boxed().collect(Collectors.toList()).map {
                Pair(it.toChar(), 0)
            }.toMap().toMutableMap()

        texto.toLowerCase().chars().forEach {
            if (alfabeto.containsKey(it.toChar())) {
                alfabeto[it.toChar()] = (alfabeto[it.toChar()] ?: 0) + 1
            }
        }
        var maximasRepeticoes = 0
        alfabeto.forEach { (char, numero) ->
            if (numero > maximasRepeticoes)
                maximasRepeticoes = numero
        }

        alfabeto.filter { it -> it.value == maximasRepeticoes }
            .forEach {
                print(it.key)
            }
        println()
    }
}
