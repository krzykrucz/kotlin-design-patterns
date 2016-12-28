package decorator

/**
 * Client interface
 */
fun main(args: Array<String>) {
    val window: Window = Border(ScrollBar(WindowImpl()))
    print("beautiful window: ")
    window.draw()
}
