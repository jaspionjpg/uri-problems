import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNext()) {
        val rastro = ler.next()
        val valor = ler.nextInt()

        var contador = 0
        var sequenciaLeitura = 0

        rastro.forEach { acao ->
            when (acao) {
                'W' -> {
                    contador++
                    if (sequenciaLeitura > 0) {
                        contador++
                        sequenciaLeitura = 0
                    }
                }
                'R' -> {
                    sequenciaLeitura++
                    if (sequenciaLeitura == valor) {
                        contador++
                        sequenciaLeitura = 0
                    }
                }
            }
        }
        if (sequenciaLeitura > 0) {
            contador++
            sequenciaLeitura = 0
        }

        println(contador);
    }
}
