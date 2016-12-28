package adapter

import java.awt.Point

/**
 * Class-type adapter
 */
class Line : Shape, LegacyLine() {
    override fun draw(x1: Int, x2: Int, y1: Int, y2: Int) {
        this.draw(Point(x1, x2), Point(y1, y2))
    }
}