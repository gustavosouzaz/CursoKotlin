package nullable

/**
 * EXERCÍCIO 1
 * -----------

 * Escreva um programa que mascara a senha, substituindo seus caracter por '*'. Se a senha for nula, a senha
 * '1234' deve ser usada, a qual deve ser mascarada depois.
 *
 */


fun main() {


    val password: String? = null
    val defaultpassword = "1234"

    val mask = "".padEnd((password ?: defaultpassword).length, '*')

    println(password)
    println(defaultpassword)


}