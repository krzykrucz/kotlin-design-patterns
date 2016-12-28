package decorator

class Border(window: Window) : WindowDecorator(window) {
    override fun draw() {
        super.draw()
        print(" with a border")
    }
}