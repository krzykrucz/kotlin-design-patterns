package bridge

/**
 * Refined abstraction
 */
class Circle(color: Color) : Shape(color) {

    override fun drawColorfulShape() {
        print("Drawing ")
        this.showColor()
        println(" circle")
    }

}