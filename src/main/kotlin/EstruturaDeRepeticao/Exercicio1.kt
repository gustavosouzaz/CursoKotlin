package EstruturaDeRepeticao

/**
 * EXERCICIO 1
 * -----------
 *
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
 */

fun main() {

    print("> ")
    val n = readln().toInt()

var i = 1

    while (i <= 10) {

        println("$n x $i = ${n * i++}")


    }




}