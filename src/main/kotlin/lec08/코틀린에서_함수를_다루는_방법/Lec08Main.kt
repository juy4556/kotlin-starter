package lec08.코틀린에서_함수를_다루는_방법

fun main() {
//    repeat("abc")
    // namedArgument 사용해 argument맵핑 가능
//    repeat(str = "abc", useNewLine = false)
    // 코틀린에서 자바 함수를 사용할 때는 namedArgument사용 불가능
    // JVM에서 java가 bytecode로 변환될 때 parameter이름을 보존하지 않기 때문
//    Lec08Main.repeat(str = "A")

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    // 배열을 가변인자에 넣어줄 때는 앞에 Spread 연산자 *을 넣어줘야 한다.
    // spread 연산자를 사용하면 배열 안에 있는 것들을 ,를 쓰는 것처럼 나열하여 꺼내준다.
    printAll(*array)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

// 이처럼 expression이기 때문에 = 사용가능(중괄호는 없애고)
// 또한 = 을 사용했을 때 결과가 모두 Int타입이기 때문에 코틀린에서 추론 가능 -> 생략 가능
fun maxV2(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

// 한줄로도 변경 가능
fun maxV3(a: Int, b: Int) = if (a > b) a else b

// default parameter 사용 가능
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


// 가변인자를 vararg로 사용해 구현
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}