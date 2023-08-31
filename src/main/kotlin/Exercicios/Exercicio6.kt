package Exercicios

/**
 * EXERCÍCIO 6
 * -----------
 *
 * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é impa ou par.
 *
 */

fun main() {


    print(">")

    val n = readln().toInt()

    if(n % 2 == 0) {

        print("é um numero par")
    }else {
        print("é um numero impar")
    }
}