package bridge

/**
 * Client interface
 */
fun main(args: Array<String>) {
    val rectangle = Rectangle(RedColor())
    rectangle.drawColorfulShape()

    val circle = Circle(BlueColor())
    circle.drawColorfulShape()
}
