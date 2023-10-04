package lec07.코틀린에서_예외를_다루는_방법

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException(String.format("주어진 ${str}는 숫자가 아닙니다."))
    }
}

// try catch도 expression, try catch finally도 동일
fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun main() {
    val fp = FilePrinter()
    fp.readFile()
}