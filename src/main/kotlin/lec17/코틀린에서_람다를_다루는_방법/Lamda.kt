package lec17.코틀린에서_람다를_다루는_방법

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 2_000),
        Fruit("사과", 3_000),
        Fruit("사과", 4_000),
        Fruit("바나나", 1_000),
        Fruit("바나나", 2_000),
        Fruit("바나나", 3_000),
        Fruit("수박", 1_000),
    )

    // 함수 이름만 빠진 람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    // 함수 이름, 반환타입이 빠지고, 중괄호와 화삺표를 사용해 람다를 만드는 방법 2
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple(Fruit("사과", 4_000))
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    // 마지막 파라미터가 함수인 경우엔 소괄호 밖에 람다 사용 가능, 소괄호안에 중괄호 있는 것이 어색해 보일 수 있기 때문!
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { a -> a.name == "사과" }
    // 람다를 작성할 때 람다에 들어오는 파라미터를 it로 직접 참조할 수 있다.
    val appleList: List<Fruit> = filterFruits(fruits) { it.name == "사과" }

}

// 코틀린에서는 함수가 1급 시민이다(java는 2급시민)
// 따라서 매개변수에 전달인자로써 함수를 넣을 수 있다.
private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter.invoke(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

// 아래처럼 filter함수를 사용해 바로 함수형으로 리턴할 수 있음
private fun filterFruits2(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}