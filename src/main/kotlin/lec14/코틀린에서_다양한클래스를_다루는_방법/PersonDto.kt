package lec14.코틀린에서_다양한클래스를_다루는_방법

fun main() {
    val person1 = PersonDto("이름", 22)
    val person2 = PersonDto("이름", 22)
    val person3 = PersonDto(name = "이준석", age = 26)
    println(person1 == person2)
    println(person1)
    println(person3)
}

// data class (자바에선 jdk16부터 비슷한 record class 도입)
// 자동으로 equals, hashcode, toString 만들어줌
data class PersonDto(
    private val name: String,
    private val age: Int
)