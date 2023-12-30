fun main(args: Array<String>) {
 val numbersStrings = listOf("one", "two" , "three" , "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))
}