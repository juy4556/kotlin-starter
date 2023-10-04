package lec19.크틀린의_이모저모

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// takeIf -> 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null반환
fun getNumberOrNull2(number: Int): Int? {
    return number.takeIf { it > 0 }
}

//takeUnless -> 주어진 조건 만족하지 않으면 그 값이, 그렇지 않으면 null반환
fun getNumberOrNull3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}