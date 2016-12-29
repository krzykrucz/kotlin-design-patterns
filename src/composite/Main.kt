package composite

/**
 * Client interface
 *
 * Drawing contains shapes which can also be a drawing
 */
fun main(args: Array<String>) {
    val firstRectangle = Rectangle()
    val secondRectangle = Rectangle()
    val circle = Circle()

    val drawing = Drawing()
    drawing.addShape(firstRectangle)
    drawing.addShape(secondRectangle)
    drawing.addShape(circle)

    drawing.draw("red")
    firstRectangle.draw("blue")
}
