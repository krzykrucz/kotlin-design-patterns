package adapter

/**
 * Client interface
 */
fun main(args: Array<String>) {
    val xLeft = 10
    val yTop = 20
    val xRight = 30
    val yBottom = 60

    val rectangle: Shape = Rectangle()
    val line: Shape = Line()
    val immutableShapeList: List<Shape> = listOf(rectangle, line)

    immutableShapeList.forEach { shape -> shape.draw(xLeft, xRight, yTop, yBottom) }
}
