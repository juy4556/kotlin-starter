package lec12.코틀린에서_object키워드를_다루는_방법

fun main() {
    val person = Person.newBaby("아가")
    println(person.age)

    // 익명클래스
    // 자바에선 new 타입이름()
    // 코틀린에선 object : 타입이름
    moveSomething(object : Movable {
        override fun move() {
            println("moving~~")
        }

        override fun fly() {
            println("flying~~")
        }
    })
}


class Person private constructor(
    val name: String,
    var age: Int
) {
    // static 대신 companion object(동행객체) 사용
    // static이란 것 자체가 클래스가 인스턴스화 될 때 새로운 값이 복제되는 것이 아니라
    // 정적으로 인스턴스끼리의 값을 공유
    // companion object는 클래스와 동행하는 '유일한' 오브젝트
    // 즉 동반객체도 하나의 객체 -> 이름 붙일 수도, 다른 객체 상속 및 구현할 수도 있음
    companion object Factory : Log {
        // const 키워드 붙이면 컴파일 시에 할당!(없으면 런타임 할당)
        // 기본 타입과 String에 붙일 수 있다.
        private const val MIN_AGE = 1

        @JvmStatic // 이 어노테이션을 통해서 자바의 static처럼 바로 접근할 수 있다.
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("아가 탄생~!")
        }
    }
}


// object 키워드 붙이면 싱글톤.. 끝!
object Singleton {
    var singletonVariable: Int = 100
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}