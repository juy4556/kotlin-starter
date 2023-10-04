package lec18.코틀린에서_컬렉션을_함수형으로_다루는_방법

fun main() {
    val fruits: List<Fruit> = listOf(
        Fruit(1L, "사과", 1_000, 1_100),
        Fruit(2L, "사과", 2_000, 2_200),
        Fruit(3L, "사과", 3_000, 3_300),
        Fruit(4L, "사과", 4_000, 4_400),
        Fruit(5L, "바나나", 1_000, 1_100),
        Fruit(6L, "바나나", 2_000, 2_200),
        Fruit(7L, "바나나", 3_000, 3_300),
        Fruit(8L, "수박", 5_000, 10_000),
    )
    //filter
    var apples = fruits.filter { fruit -> fruit.name == "사과" }
    //filterIndexed
    apples = fruits.filterIndexed { idx, fruit -> idx < 2 && fruit.name == "사과" }
    //map
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }.map { fruit -> fruit.currentPrice }
    //mapIndexed
    val applePricesWithIndex = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit -> listOf(fruit.id, fruit.currentPrice) }
    //mapNotNull
//    val values = fruits.filter { fruit -> fruit.name == "사과" }.mapNotNull { fruit -> fruit?.nullOrValue() }

    //all -> 조건을 모두 만족하면 true, 아니면 false 반환
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    //none -> 조건을 모두 불만족하면 true, 아니면 false 반환
    val isAllNoApple = fruits.none { fruit -> fruit.name == "사과" }
    //any -> 조건을 하나라도 만족하면 true, 아니면 false
    val isAnyApple = fruits.any { fruit -> fruit.factoryPrice >= 5000 }
    // count
    val fruitCount = fruits.count()
    // sortedBy
    val ascSorted = fruits.sortedBy { fruit -> fruit.currentPrice }
    val descSorted = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    // distinctBy : 변형된 값을 기준으로 중복 제거
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }.map { fruit -> fruit.name }
    // first : 첫번째 값을 가져오는데 무조건 null이 아니어야 함(null이면 Exception발생)
    fruits.first()
    fruits.last()
    // firstOrNull : 첫번째 값 또는 비어있는 리스트라면 null을 반환
    fruits.firstOrNull()
    fruits.lastOrNull()

    // 과일이름을 키로 그룹핑하여 리스트 맵핑 (List를 Map으로!)
    // groupBy
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
//    for ((key, value) in map.entries) {
//        println("${key} ${value}")
//    }
    // 과일 id를 키로 과일객체 맵핑
    // associateBy
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // 과일이름 to List<출고가> Map
    val map3: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })

    // id to List<출고가> Map
    val map4: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })

    val map5: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
                                                .filter { (key, value) -> key == "사괴" }

    // 중첩된 컬렉션 처리
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_100),
            Fruit(2L, "사과", 2_000, 2_200),
            Fruit(3L, "사과", 3_000, 3_300),
            Fruit(4L, "사과", 4_000, 4_400),
        ),
        listOf(
            Fruit(5L, "바나나", 1_000, 1_100),
            Fruit(6L, "바나나", 2_000, 2_200),
            Fruit(7L, "바나나", 3_000, 3_300),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000),
            )
    )
    // 출고가와 현재가 동일한 과일 고르기
    // flatMap을 사용해 List<List<>>를 단일 List<>로 바꾸기
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice } }

    // 확장함수를 만들어 아래와 같이 하나의 람다함수만 쓰는 것처럼 보이게 리팩토링 가능
    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }

    // List<List<>>를 List<>로 그냥 바꾸기
    // flatten()
    fruitsInList.flatten()
}

// local extensionFunction is not allowed 나서 여기에 둠
val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)
