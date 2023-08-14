import java.util.Scanner

fun main() {

  //  print("> ")
   // val n1 = readln().toInt()  ----> PRIMEIRA OPÇÃO

    // print("> ")
    // val n2 = readln().toInt()



    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()                  //----> SEGUNDA OPÇÃO, tanto faz o jeito

    print("> ")
    val n2 = scanner.nextInt()


    println("Resultado: ${n1 + n2}")

}