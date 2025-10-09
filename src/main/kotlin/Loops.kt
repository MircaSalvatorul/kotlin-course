fun main() {
    println("Cate numere pui?")
    val amountOfNumbers = readln().toIntOrNull() ?:0

    var sum=0
    var i = 0
    while(i< amountOfNumbers){
        println("Enter number #${i+1}")
        val number = readln().toIntOrNull() ?: continue
        i++
        sum += number
    }

    println("Suma e $sum")
}