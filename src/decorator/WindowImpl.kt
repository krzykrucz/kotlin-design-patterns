package decorator

/**
 * Concrete component
 */
class WindowImpl : Window {
    override fun draw() {
        print("I'm a window")
    }
}