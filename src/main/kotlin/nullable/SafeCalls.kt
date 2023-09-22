package nullable

fun main() {

    val s1: String? = "abcde"

    if(s1 != null) {

        val s2: String = s1.uppercase()
        println(s2)

        val s3: String = s2.reversed()
        println(s3)


        val s4 = s3.length
        println(s4)
    }


}