package lec19.크틀린의_이모저모

/*
    for 및 while문에서
    return, break, continue 기능은 자바와 동일하다.
    하지만 forEach문에서는 동작하지 않는다
    그렇지만 forEach문과 함께 꼭 return, break, continue문을 쓰고 싶다?
    -> run이라는 블록으로 한 번 감싸주고 return@run과 같이 뒤에 @run 라벨을 사용한다.
 */

fun main() {

    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    numbers.forEach { number ->
        if (number == 2) {
            //break -> 빨간줄 표시됨
        }
    }

    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run // break를 꼭 forEach와 함께 쓰고 싶을 때 return@run 라벨 사용
                return@forEach // continue를 꼭 forEach와 함께 쓰고 싶을 때 return@forEach 라벨 사용
            }
        }
    }


    // label
    // 라벨을 사용한 jump는 사용하지 않는 것이 좋다.
    // 복잡도가 증가하고 유지보수하기 힘들어진다.
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc // 라벨을 붙여 안쪽 for문이 아니라 바깥쪽 for문을 멈추도록 할 수 있다.
            }
            println("${i} ${j}")
        }
    }
}