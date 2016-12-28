package facade

class Parser {
    private val scanner: Scanner = Scanner()

    fun parse(sourceFile: String) {
        scanner.scan(sourceFile)
        println("Started parsing $sourceFile")
    }

}

