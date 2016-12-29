package composite

/**
 * Leaf component
 */
class Rectangle : Shape {
    override fun draw(color: String) {
        println("Drawing $color rectangle")
    }
}