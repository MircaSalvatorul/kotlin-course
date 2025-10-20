import javax.sql.rowset.Predicate

fun main() {
    println("Introdu string")
    val input = readln()

    val favoriteNumbers = intArrayOf(1,2,3,69)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }

    val lambda:(Char)-> Boolean = {
        it.isLetter()
    }

    val lettersOnly = input.myFilter (lambda)

    println(lettersOnly)
}

fun String.myFilter(predicate: (Char)-> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if(predicate(char)){
                append(char)
            }
        }
    }
}