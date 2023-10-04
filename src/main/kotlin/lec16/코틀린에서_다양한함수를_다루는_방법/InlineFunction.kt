package lec16.코틀린에서_다양한함수를_다루는_방법

/*
    inline함수
    함수가 호출되는 대신,
    함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
    아래 예시에선 실제 덧셈하는 로직이 main함수 안으로 들어오게 된다.
    복사붙여넣기를 하는 이유?
    함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
    함수가 다른 함수 call하고, 그 함수가 다른 함수 call할 때,
    이 call chain에 overhead가 발생할 수 있다.
    이 overhead를 줄이기 위해 사용하는데 성능측정과 함께 신중하게 사용되어야 한다.
    코틀린 라이브러리에는 최적화를 어느 정도해놔 적절히 inline함수가 붙어있다.
 */

fun main() {
    println(1.add3(2))
}

inline fun Int.add3(other: Int): Int {
    return this + other
}
