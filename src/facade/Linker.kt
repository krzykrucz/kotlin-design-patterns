package facade

class Linker {
    fun link(sourceFile : String): String {
        val resultFile = sourceFile.toLowerCase().replace(".obj", ".exe")
        println("Linked to executable $resultFile")
        return resultFile
    }

}