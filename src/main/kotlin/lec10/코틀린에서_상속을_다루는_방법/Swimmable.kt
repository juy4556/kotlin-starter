package lec10.코틀린에서_상속을_다루는_방법

interface Swimmable {

    // 필드가 아닌 프로퍼티(필드메모리+getter+setter)를 인터페이스에 넣어 getter나 setter를 하위 계층에서 구현하는 것을 강제할 수 있다.
    val swimAbility: Int

    fun act() {
        println("어푸 어푸")
    }
}