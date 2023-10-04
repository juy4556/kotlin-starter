package lec19.크틀린의_이모저모

/*
    구조분해
    복합적인 값을 분해하여 여러 변수를 한 번에 초기화하는 것
    for ((key, value) in map.entries) {}
    에서 (key, value)도 구조분해문법을 사용한 것!
 */

// data 클래스는 기본적으로 자기가 갖고 있는 field에 대해서 componentN함수를 만들어준다.
//data class Person(
//    val name: String,
//    val age: Int
//)

class Person(
    val name: String,
    val age: Int
) {
    //componentN함수는 사실 연산자 속성을 갖고 있어 연산자 오버로딩을 하는 것처럼 간주되어야 한다.
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {

    val person = Person("이준석", 26)
    // 구조 분해(이 또한 componentN함수를 내부적으로 사용하는 것이다)
//    val (name, age) = person
    // componentN
    val name = person.component1()
    val age = person.component2()
    println("이름: ${name}, 나이: ${age}")


}