package bridge

/**
 * Refined abstraction
 */
class Rectangle(color: Color) : Shape(color) {

    override fun drawColorfulShape() {
        print("Drawing rectangle which is ")
        this.showColor()
        println()
    }

}