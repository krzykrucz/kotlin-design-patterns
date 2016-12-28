package facade

class Assembler {
    fun assemble(sourceFile : String): String {
        val resultFile = sourceFile.toLowerCase().replace(".asm", ".obj")
        println("Translated to binary object code $resultFile")
        return resultFile
    }

}