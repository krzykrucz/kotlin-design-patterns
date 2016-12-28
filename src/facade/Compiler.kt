package facade

/**
 * Facade
 */
class Compiler {
    private val parser: Parser = Parser()
    private val linker: Linker = Linker()
    private val assembler: Assembler = Assembler()

    fun compile(sourceFile: String) {
        parser.parse(sourceFile)
        val assemblyFile = compileInternal(sourceFile)
        val binaryFile = assembler.assemble(assemblyFile)
        val executableFile = linker.link(binaryFile)

        println(">>> Compilation successful")

    }

    private fun compileInternal(sourceFile: String): String {
        val assemblyFile = sourceFile.toLowerCase().replace(".cpp", ".asm")
        System.out.println("Compiled to assembly " + assemblyFile)
        return assemblyFile
    }
}
