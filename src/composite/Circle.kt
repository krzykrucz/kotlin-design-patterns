package composite

/**
 * Leaf component
 */
class Circle : Shape {
    override fun draw(color: String) {
        println("Drawing $color circle")
    }
}