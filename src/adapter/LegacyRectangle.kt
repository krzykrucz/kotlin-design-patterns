package adapter

import java.awt.Point

/**
 * Adaptee
 */
class LegacyRectangle(val bottomRight: Point, val topLeft: Point) {

    fun draw() {
        val width: Int = bottomRight.getX().minus(topLeft.getX()).toInt()
        val height: Int = bottomRight.getY().minus(topLeft.getY()).toInt()
        println("rectangle at (${topLeft.x},${topLeft.y}) with width $width and height $height")
    }
}