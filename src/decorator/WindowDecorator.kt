package decorator

/**
 * Decorator
 */
abstract class WindowDecorator(val window: Window) : Window {

    override fun draw() {
        window.draw()
    }

}