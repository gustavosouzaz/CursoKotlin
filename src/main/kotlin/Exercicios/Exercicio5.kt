package Exercicios


/**
 * EXERCÍCIO 5
 * -----------
 *
 * Escreva um programa que recebe um valor numérico pelo teclado, multiplica por ele mesmo e imprime o resultado.
 * Entretanto, se o valor fornecido for maior que 10 ele dve ser ajustado para 10 antes de ser multiplicado.
 */

fun main() {

    print("> ")
    var numero = readln().toInt()

    if (numero > 10) {
        numero = 10
    }

     numero *= numero
    print(numero)
}