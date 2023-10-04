package lec18.코틀린에서_컬렉션을_함수형으로_다루는_방법

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}