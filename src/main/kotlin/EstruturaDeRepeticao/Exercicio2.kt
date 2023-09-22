package EstruturaDeRepeticao

/**
 * EXERCICIO 2
 * -----------
 *
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário.
 * Utilize a estrutura de repetição for para resolver o exercicio.
 */

fun main() {

    print("> ")

    val t = readln().toInt()
    val x = 10

    for (f in 1..x) {

        println("$t x $f = ${f * t} ")

    }

}