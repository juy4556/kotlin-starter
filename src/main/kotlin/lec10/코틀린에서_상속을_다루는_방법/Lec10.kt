package lec10.코틀린에서_상속을_다루는_방법

fun main() {
    Derived(200)
}

// 다른 클래스가 해당 클래스를 상속하거나 상속시키고 싶은 프로퍼티가 있으면 클래스 선언부와 프로퍼티 앞에 open 키워드를 붙여줘야 한다.
open class Base(
    open val number: Int = 100
) {
    init{
        println("Base Class")
        // 하위 클래스에서 오버라이드하고 있는 프로퍼티에 접근하면 안됨
        // 상위 클래스를 설계할 때 생성자 또는 초기화 블록에서 사용되는 프로퍼티에는 open 사용을 피해야 한다.
        println(number)

    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init{
        println("Derived")
        println(number)
    }
}