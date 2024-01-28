package POO

fun main(){

    val account1 = Account()
    val account2 = Account()

  account1.deposit(200.0)
    account2.deposit(6000.0)

  println(account2.balance)
    println(account1.balance)

}