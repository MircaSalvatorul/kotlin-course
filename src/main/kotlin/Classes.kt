import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(
        width = 5f,
        height = 7f
    )

    val circle = Circle(radius = 5f)
    println("The diagonal is ${rect1.diagonal}. The area is ${rect1.area}")

    println(sumAreas(rect1,circle))
}

interface Shape {
    val area: Float
    val circumference: Float
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf {
        currentShape -> currentShape.area.toDouble()
    }
}

fun maxArea(rect1: Rectangle, rect2: Rectangle): Float {
    val area1 = rect1.area
    val area2 = rect2.area

    return maxOf(area1,area2)
}

data class Rectangle(val width: Float, val height: Float): Shape {
    val diagonal = sqrt(width * width + height * height)

    override val area = width * height

    override val circumference = 2 * width+ 2* height
}
data class Circle (val radius: Float):Shape {
    override val area = radius * radius * PI.toFloat()
    override val circumference = 2 * radius * PI.toFloat()
    val diameter = 2 * radius
}