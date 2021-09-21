package problems

fun main(args: Array<String>) {
    for (i in 0..10) {
        if (i == 0 || i == 5 || i == 10) {
            println("I=%.0f J=%.0f".format(i * 0.2, 1 + i * 0.2))
            println("I=%.0f J=%.0f".format(i * 0.2, 2 + i * 0.2))
            println("I=%.0f J=%.0f".format(i * 0.2, 3 + i * 0.2))
        } else {
            println("I=%.1f J=%.1f".format(i * 0.2, 1 + i * 0.2))
            println("I=%.1f J=%.1f".format(i * 0.2, 2 + i * 0.2))
            println("I=%.1f J=%.1f".format(i * 0.2, 3 + i * 0.2))
        }
    }
}