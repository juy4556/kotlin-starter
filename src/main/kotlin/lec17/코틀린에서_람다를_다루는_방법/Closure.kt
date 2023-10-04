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
    var targetFruitName = "사과"
    targetFruitName = "바나나"
    // 코틀린은 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
    // 이렇게 해야 람다를 진정한 일급 시민으로 간주할 수 있다.
    // 이 데이터 구조를 Closure라고 한다.
    filterFruits(fruits) { it.name == targetFruitName }
}

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