package decorator

class ScrollBar(window: Window) : WindowDecorator(window) {
    override fun draw() {
        super.draw()
        print(" with a scrollbar")
    }
}