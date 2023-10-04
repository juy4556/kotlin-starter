package lec19.크틀린의_이모저모

// 같은 이름의 함수나 클래스를 동시에 import하기 위해 import as를 사용해 이름을 바꿀 수 있다.
import lec17.코틀린에서_람다를_다루는_방법.Fruit as Fruit17
import lec18.코틀린에서_컬렉션을_함수형으로_다루는_방법.Fruit as Fruit18

/*
    타입 명시가 너무 길 때나 이름 긴 클래스를 컬렉션에 사용할 때, 이를 축약하는 용도로 사용할 수 있다.
 */
typealias FruitFilter = (Fruit18) -> Boolean
typealias USGTMap = Map<String, UltraSuperGuardianTribe>

class UltraSuperGuardianTribe(
    val name: String
)

fun filterFruits(fruits: List<Fruit18>, filter: FruitFilter) {

}

