fun main() {

    val number = 345;

    println(fizzBuzz(number))
}
fun fizzBuzz(number: Int): String {

    return when
    {
        number % 3 == 0 && number % 5 == 0 -> "fizzbuzz"
        number % 3 == 0 -> "fizz"
        number % 5 == 0 -> "buzz"
        else -> number.toString()
    }
}