package bridge

/**
 * Abstraction
 */
abstract class Shape(private val color: Color) {

    abstract fun drawColorfulShape()

    protected fun showColor() {
        print(this.color.getColor())
    }
}

