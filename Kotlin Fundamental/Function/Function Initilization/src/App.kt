// main function
fun main() {
    val user = setUser("Farouq", 21)
    println(user)

    printUser("Farouq")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}