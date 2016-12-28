package facade

/**
 * Client interface
 */
fun main(args: Array<String>) {
    val sourceFile: String = "wildLanguageProgram.cpp"
    Compiler().compile(sourceFile)
}
