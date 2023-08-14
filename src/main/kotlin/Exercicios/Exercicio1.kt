package Exercicios


   /* EXERCÍCIO 1
  -----------------------

  Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas informações
  (use string tempaltes para montar a frase)

    */

fun main() {

    println("Responda esse pequeno formulário:")

    println("Qual seu nome?")
    val nome = readln()

    println("Qual sua idade?")
    val idade = readln().toInt()

    println("Qual seu peso?")
    val peso = readln().toDouble()


    println("O seu nome é $nome, você tem $idade e o seu peso é $peso")

}

