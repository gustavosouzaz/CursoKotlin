fun main() {

    val x = 0

    when (x) {

        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("É 30")
        else -> println("Desconhecido")

    }

    when {

        x < 10 -> println("Positivo")
        x > 10 -> println("Negativo")

    }



}