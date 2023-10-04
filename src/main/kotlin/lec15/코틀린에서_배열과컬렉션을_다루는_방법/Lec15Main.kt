package lec15.코틀린에서_배열과컬렉션을_다루는_방법

fun main() {
    // 배열
    val array = arrayOf(100, 200)
    array.plus(300)
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for (i in array.withIndex()) {
        println("${i.index} ${i.value}")
    }

    // 불변 리스트
    // listOf를 통해 불변 리스트 만든다.
    // emptyList<타입>()을 통해 비어있는 리스트 생성 가능

    val immutableList = listOf(100, 100.50, "타입이랑 상관없는거아닌가?")
    immutableList.plus("키킼")
    for (n in immutableList) {
        println(n)
    }

    val emptyList = emptyList<Int>()
    emptyList.plus("abc")  // 요소 추가 안됨
    println(emptyList)

    for ((idx, value) in immutableList.withIndex()) {
        println("${idx} ${value}")
    }

    // 가변 리스트(삽입, 삭제 가능)
    // mutableListOf()사용 -> ArrayList가 기본 구현체
    // 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸기!
    val mutableList = mutableListOf(1, 2, 3, 4)
    mutableList.add(5)
    mutableList.remove(3)
    mutableList.addAll(2, mutableList)
//    mutableList.removeIf { x -> x > 1 }
    mutableList.reverse()
    println(mutableList)
    mutableList.removeAll(arrayListOf(1, 2, 3, 4, 5))
    println(mutableList)

    // 집합
    // 집합도 immutable과 mutable로 나뉨
    // 자료구조 특성만 다르고 list와 같음
    val immutableSet = setOf(1,2,3,4,5)
    immutableSet.plus(3)
    println(immutableSet)
    for ((idx, value) in immutableSet.withIndex()) {
        println("${idx} ${value}")
    }

    // mutableSet
    // 기본 구현체는 LinkedHashSet이다
    val mutableSet = mutableSetOf(1,2,3,4,5)
    mutableSet.add(3)
    mutableSet.remove(1)
    mutableSet.removeAll(arrayOf(1,2,3,4))
    println(mutableSet)

    // Map
    // 타입 추론이 안되기에 mutableMapOf에서는 타입 지정
    val mutableMap = mutableMapOf<Int, String>()
    mutableMap.put(1, "one")
    mutableMap.put(2, "two")
    mutableMap[3] = "three"
    mutableMap[4] = "four"

    // immutableMap
    val immutableMap = mapOf(1 to "one", 2 to "two")

    for ((idx, value) in mutableMap.entries) {
        println("${idx} ${value}")
    }

}