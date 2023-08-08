

fun main() {

    val s1 = "abc"
    val s2 = "dfg"

    //val s1s2 = "Soma: " + (s1 + s1) --> não esta errado, porém abaixo é a forma como o kotlin proporciona

    val s1s2 = "Soma: $s1$s2"
    println(s1s2)


}