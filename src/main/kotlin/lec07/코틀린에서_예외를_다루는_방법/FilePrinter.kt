package lec07.코틀린에서_예외를_다루는_방법

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    // 코틀린은 checkedException과 uncheckedException을 구분하지 않고
    // 모두 uncheckedException으로 간주
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val br: BufferedReader = BufferedReader(FileReader(file))
        println(br.readLine())
        br.close()
    }

    // 코틀린에선 try-with-resource 구문 사라짐
    // 대신 inline 확장함수 use를 사용함
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}