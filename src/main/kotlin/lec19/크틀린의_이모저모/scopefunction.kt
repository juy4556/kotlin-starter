package lec19.크틀린의_이모저모

/*
    scope function: 일시적인 영역을 형성하는 함수
    람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나,
    method chaining에 활용하는 함수를 scope function이라고 한다.
    1. let
    : 람다의 결과 반환, it사용
    2. run
    : 람다의 결과 반환, this사용
    3. also
    : 객체 그 자체 반환, it사용
    4. apply
    : 객체 그 자체 반환, this사용
    5. with(parameter, lambda)
    : 내가 넣고 싶은 것 parameter로 넣고 this를 사용해 접근(물론 생략 가능)
    it과 this의 차이?
    it은 p -> p.age와 같이 다른 이름을 사용할 수 있다.
    this는 this를 생략할 수 있다.

    왜 이런 차이가 발생할까?
    public inline fun <T, R> T.let(block: (T) -> R): R {
    let은 일반함수를 받는다. 즉, argument를 직접 parameter로 받아서 parameter를 함수 내부에서 직접 호출한다.
    따라서 이름을 마음대로 변경할 수 있다.
    public inline fun <T, R> T.run(block: T.() -> R): R {
    run은 확장함수를 받는다. 확장함수는 본인 자신을 this로 호출하고 생략가능하다는 특징이 있기에 이런 차이가 발생한다.

 */

fun printPerson(person: Person?) {
    // let을 사용해 람다를 넣음으로써 일시적인 영역이 생김
    person?.let { p ->
        println(p.name)
        println(p.age)
    }
//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }
}

fun main() {
    val person = Person("이준석", 26)
    // 람다 결과 값 반환, it사용
    val value1 = person.let {
        it.age
    }
    // 람다 결과 값 반환, this사용
    val value2 = person.run {
        this.age
    }
    // 객체 그 자체 반환, it사용
    val value3 = person.also {
        it.age
    }
    // 객체 그 자체 반환, this사용
    val value4 = person.apply {
        this.age
    }
    with(person) {
        println(this.name)
        println(age)
    }
    println("${value1}, ${value2}, ${value3}, ${value4}")

//    val numbers = listOf("one", "two", "three", "four")
//    val modifiedFirstItem =
//        numbers.first().let { firstItem -> if (firstItem.length >= 5) firstItem else "!$firstItem!" }.uppercase()
//    println(modifiedFirstItem)
}