package lec06.코틀린에서_반복문을_다루는_방법

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (num in numbers) {
        println(num)
    }
    // ..은 등차수열을 만들어 주는 코드
    // 등차수열을 만들기 위해선 시작값, 끝값, 공차가 필요
    // default로 공차는 1
    for (i in 1..3) {
        println(i)
    }
    // downTo를 사용하면 공차가 -1
    for (i in 3 downTo 1) {
        println(i)
    }
    // step 키워드로 공차를 2로
    // downTo와 step 모두 함수(중위 함수)
    // 아래는 1~5 등차수열을 만들고, step이라는 함수호출(등차수열.step(2))와 같음
    // 이처럼 코틀린에서 전통적인 for문은 등차수열을 사용하는 것을 알 수 있음
    for (i in 1..5 step 2) {
        println(i)
    }

    // while, do-while은 java와 같음
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}