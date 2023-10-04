package lec05.코틀린에서_제어문을_다루는_방법

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score 범위는 0부터 100입니다")
    }

    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }
}

// 코틀린은 if-else if-else문은 expression이면서 statement -> 코틀린 삼항연산자 없다!
// 자바는 statement
// statement는 결과가 여러개 일 수 있고, expression은 결과가 단 하나이다.
fun getPassrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

// switch문 또한 expression 이면서 statement
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitchAndIn(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

//fun startWithA(obj: Any): Boolean {
//    return when (obj) {
//        is String -> obj.startWith("A")
//        else -> false
//    }
//}

fun judgeNumber(number: Int) {
    return when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    return when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 1 -> println("홀수입니다")
        else -> println("짝수입니다")
    }
}