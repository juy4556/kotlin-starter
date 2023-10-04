package lec09.코틀린에서_클래스를_다루는_방법;

fun main() {
    val person = Person("이준석", 26)
    println(person.name)
    println(person.age)

    val baby = Person("아가", 0)
    println(baby.age)

    // 두 번째 생성자를 통해 생성되지만 역순으로 실행되어 초기화 블럭 -> 첫 번째 생성자 -> 두 번째 생성자 순으로 출력된다.
    Person()
}

// 주생성자는 반드시 존재해야 하며, 파라미터가 하나도 없다면 생략 가능하다.
class Person(
    val name: String,
    var age: Int = 0     // 부생성자보다는 default parameter를 권장한다!
) {

    val uppercaseName: String
        get() = this.name.uppercase()
    // 커스텀 getter를 만들기 위해 주생성자에서 name앞에 val뺌(getter, setter가 자동으로 만들어지기 때문)
//    val name = name
//        get() = field.uppercase()  // 자기 자신을 가리키는 예약어 field(자기 자신을 가리키는 보이지 않는 backing field)를 사용한다
    //  get() = name.uppercase() -> getter를 부르면 name을 부르고, name을 부르면 getter를 호출해 무한루프가 발생한다!!

    // 클래스가 호출되는 시점에 한 번 호출되는 블럭
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블럭")
    }

    // 부생성자는 있을 수 있고, 없을 수 있으며,
    // 최종적으로 주생성자를 this로 호출해야 한다.(중간에 다른 부생성자 호출하는 것은 당연히 가능)
    // body를 가질 수 있다.
    // converting의 경우 부생성자를 사용할 수 있지만 정적 팩토리 메서드 추천
    constructor(name: String) : this(name, 0) {
        println("첫 번째 생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }
    // 위 함수 대신 custom getter를 사용해 프로퍼티로 만들 수 있다
    val isAdult: Boolean
        get() = this.age >= 20

    // 아래도 가능
//    val isAdult: Boolean
//        get() {
//            return this.age >= 20
//        }
}
