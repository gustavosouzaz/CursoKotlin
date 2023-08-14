package Exercicios


/* EXERCÍCIO 2
  -------------

  Crie um programa que arrendonda um valor decimal informado pelo suário e mostra a resposta na tela.
  O arredondamento pode ser feito trocando as casas decimais.


 */





fun main() {

   println("Informe um número decimal para o arredondamento")

   var nd = readln().toDouble()
    print("O arredondamento ficou de, ${nd.toInt()}")

}