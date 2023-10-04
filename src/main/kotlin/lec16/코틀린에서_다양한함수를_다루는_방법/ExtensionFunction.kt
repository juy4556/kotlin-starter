package lec16.코틀린에서_다양한함수를_다루는_방법

fun main() {
    val str = "abc"
    println(str.lastChar())
}

/*
    확장함수
    fun 확장하려는클래스(수신객체타입).함수이름(파라미터): 리턴타입 {
        //this(수신객체)를 이용해 실제 클래스 안의 값에 접근
    }
    확장함수는 원본 클래스의 private 또는 protected 멤버를 가져올 수 없다!(캡슐화)
    확장함수와 멤버함수 시그니처가 동일하면 멤버함수가 우선적으로 호출된다!

 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}
//// 아래처럼 확장함수 + custom getter를 합쳐놓은 것처럼 확장 프로터리 사용 가능
//val String.lastChar: Char
//    get() = this[this.length - 1]

/*
Srt->Train 상속하고, 두 클래스에 대해 모두 같은 시그니처의 확장함수를 만들면 뭐가 호출될까?
해당 변수의 현재 타입. 즉, 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
val train: Train = Train()
train.isExpensive() // Train의 확장함수 호출

val srt1: Train = Srt()
srt1.isExpensive() // Train의 확장함수 호출

val srt2: Srt = Srt()
srt2.isExpensive() // Srt의 확장함수 호출

 */
