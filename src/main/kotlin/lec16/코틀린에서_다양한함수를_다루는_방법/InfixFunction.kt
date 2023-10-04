package lec16.코틀린에서_다양한함수를_다루는_방법

/*
    infix함수(중위함수)
    downTo, step도 함수이다!
    변수와 argument가 각각 하나씩 있는 경우에
    변수.함수이름(argument) 대신
    변수 함수이름 argument

    멤버함수에도 붙일 수 있다.
 */

fun main() {
    println(1.add(2))
    println(1.add2(3))
    println(1 add2 4)
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}