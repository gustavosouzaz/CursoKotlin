package EstruturaDeSelecao

/**
 * EXERCICIO 3
 * -----------
 *
 * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
 *
 * - CRIANÇA: 0 a 12 anos
 * - ADOLESCENTE: 13 a 17 anos
 * - ADULTO: 18 a 65 anos
 * - IDOSO 65 anos ou mais
 */

fun main() {

    print("Informe sua idade: ")

    val age = readln().toInt()

    if (age >= 0 && age <= 12) {

        print("VOCÊ É UMA CRIANÇA :)")

    }else if(age >= 13 && age <= 17) {

        print("VOCÊ É UM ADOLESCENTE ;)")

    }else if (age >= 18 && age <= 65) {

        print("VOCÊ É ADULTO :(")

    }else if (age >= 66 && age <= 120) {

        print("VOCÊ É IDOSO *---*")
    }else {

        print("Idade Inválida  ´---´ ")
    }


}