package Funcao

import java.lang.StringBuilder

/**
 * EXERCÍCIO 2
 * -----------
 *
 * Escreva uma função que separa todos os caracteres de uma String com um espaço em branco. Está função
 * deve receber um paramentro opcional indicando se a String deve ser convertida para maiuscula.
 */


fun main(){

    println(spacing("Oi, tudo bem"))
}

fun spacing(str: String, isUppercase: Boolean = false): String {

    val sb = StringBuilder()

    for (c in str) {
        sb.append("$c")
    }


    var r = sb.toString()

   if (isUppercase) {
       r = r.uppercase()
   }

    return r

}