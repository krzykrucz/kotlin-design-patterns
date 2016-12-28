package adapter

import java.awt.Point

/**
 * Object-type adapter
 */
class Rectangle : Shape {
    override fun draw(x1: Int, x2: Int, y1: Int, y2: Int) {
        LegacyRectangle(Point(x2, y2), Point(x1, y1)).draw()
    }
}