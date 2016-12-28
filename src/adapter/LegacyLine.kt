package adapter

import java.awt.Point

/**
 * Adaptee
 */
open class LegacyLine {
    fun draw(p1: Point, p2: Point) {
        println("line with coordinates:${p1.x},${p1.y} and ${p2.x},${p2.y}")
    }
}