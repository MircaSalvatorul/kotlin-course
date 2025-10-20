fun main() {
    println("Introdu string")
    val input = readln().toInt()

    println(input + input.reversed())

}

fun String.reversed(): String {
    val finalString = buildString {
        for(i in this@reversed.lastIndex downTo 0)
            append(this@reversed[i])
    }
    return finalString
}

//function overflows are.... something
fun Int.reversed():Int {
    return this.toString().reversed().toInt()
}