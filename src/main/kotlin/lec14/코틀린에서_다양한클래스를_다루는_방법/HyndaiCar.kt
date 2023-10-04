package lec14.코틀린에서_다양한클래스를_다루는_방법


fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyndaiCar) {
    when (car) {
        is Avante -> println("이름은 ${car.name}이고, 가격은 ${car.price}")
        is Grandeur -> println("이름은 ${car.name}이고, 가격은 ${car.price}")
        is Sonata -> println("이름은 ${car.name}이고, 가격은 ${car.price}")
    }
}
/*
    상속이 가능하도록 추상클래스를 만들까 하지만 외부에선 이 클래스를 상속받지 않았으면..
    -> 하위 클래스를 봉인! -> Sealed Class, Sealed Interface
    하위 클래스는 같은 패키지에 있어야 한다.
    추가로 JDK17에서도 Sealed Class 추가됨
    Enum과 같은 점
    컴파일 타임에 하위 클래스 타입을 모두 기억,
    런타임에 클래스 타입이 추가될 수 없다.
    -> when expression과 활용할 때 좋다!

    Enum과 다른 점은
    1. 클래스를 상속받을 수 있다.  (Enum은 인터페이스 구현만 가능)
    2. 하위 클래스는 멀티 인스턴스가 가능하다. (Enum은 각 코드가 싱글톤)
 */
sealed class HyndaiCar(
    val name: String,
    val price: Long
)

class Avante : HyndaiCar("아반떼", 1_000L)
class Sonata : HyndaiCar("소나타", 2_000L)
class Grandeur : HyndaiCar("그랜저", 3_000L)