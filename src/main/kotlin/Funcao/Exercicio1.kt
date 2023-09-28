package Funcao

/**
 * EXERCÍCIO 1
 * -----------
 *
 * Escreva uma função que calcula a idade humana equivalente de um cachorro, considerando que cada ano que cachorro vive
 * é equivalente a 7 anos de vida de um ser humano. O valor da idade deve ser fornecido via teclado.
 */



fun main() {

println(
    calcularIdade(
        readln().toDouble()


    ).toInt()
)


}

fun calcularIdade(idade: Double): Double{

    return idade * 7


}