package classes

class Log private constructor() {

    companion object Factory { // single companion object
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String) : this()
}


fun main() {
    // val log = Log("file")
    val fileLog = Log.Factory.createFileLog("file.txt")
    val fileLog2 = Log.createFileLog("file.txt")
}
