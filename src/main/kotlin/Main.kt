fun main() {
    println("Please input a number")
    val input = readln().toInt()
    var x=5
    x+=5
    val y=9
    val areBothEven = input%2 == 0 && y%2==0
    println("Is x an even number? $areBothEven")
}