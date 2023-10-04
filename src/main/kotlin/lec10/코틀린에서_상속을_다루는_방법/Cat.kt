package lec10.코틀린에서_상속을_다루는_방법

class Cat(
    species: String,
) : Animal(species, 4) {

    override fun move() {
        println("고양이는 사뿐사뿐 걸어가")
    }
}