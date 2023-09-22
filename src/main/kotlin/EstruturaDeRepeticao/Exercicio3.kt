package EstruturaDeRepeticao

import kotlin.random.Random


/**
 * EXERCICIO 3
 * -----------
 *Crie um jogo de adivinhação  númerica. O computador deve ser sortear um número aleatorio dentro de um intervalo e você
 * deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor do que o numero tentado.
 * O jogo acaba quando o número tentado for achado.
 *
 */

fun main() {

    val secret = Random.nextInt(0, 101)
    var n = 0
    var playing = true

    while (playing) {

        print("> ")
        n = readln().toInt()

        when {

            n > secret -> println("O número sorteado é menor")
            n < secret -> println("O número sorteado é maior")
            else ->  playing = false

        }

    }

println("PARABÉNS, você acertou o número sorteado, que era $n")

}