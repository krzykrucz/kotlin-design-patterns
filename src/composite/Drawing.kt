package composite

import java.util.*

/**
 * Composite
 */
class Drawing : Shape {

    private val shapes: MutableList<Shape> = ArrayList()

    override fun draw(color: String) {
        this.shapes.forEach { shape -> shape.draw(color) }
    }

    fun addShape(shape: Shape) {
        this.shapes.add(shape)
    }

    fun removeShape(shape: Shape) {
        this.shapes.remove(shape)
    }

    fun getShapes(): List<Shape> {
        return this.shapes.toList()
    }
}