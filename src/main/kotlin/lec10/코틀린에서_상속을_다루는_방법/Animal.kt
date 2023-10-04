package lec10.코틀린에서_상속을_다루는_방법;

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int, // open 키워드를 사용해 프로퍼티에 대해 오버라이딩 가능
) {
    abstract fun move()
}
