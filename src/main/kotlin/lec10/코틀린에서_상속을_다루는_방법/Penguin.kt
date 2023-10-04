package lec10.코틀린에서_상속을_다루는_방법

class Penguin(
    species: String,
    private val wingCount: Int = 2
) : Animal(species, 2), Swimmable, Flyable {

    override fun move() {
        println("펭귄은 뒤뚱뒤뚱~")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}