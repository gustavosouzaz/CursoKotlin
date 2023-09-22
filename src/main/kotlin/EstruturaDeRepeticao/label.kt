package EstruturaDeRepeticao

fun main() {

   repeticao@ for(i in 'A'..'E') {

        for(j in 1..5){
            print("$i$j")

            if (j == 3) {
                break@repeticao
            }

        }
       println()

    }

    println("FIM")
}