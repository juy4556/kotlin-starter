package lec11.코틀린에서_접근제어를_다루는_방법

// 코틀린에선 직접 파일에 유틸성 코드를 작성해서 사용하는 게 훨씬 편하다.
// 자바 코드로 보면 정적(static) 메서드로 생성이 된다!
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}


// Java와 Kotlin을 함께 사용 시 주의할 점!
// internal은 바이트 코드 상 public이 된다.
// 때문에 Java 코드에서 Kotlin 모듈의 internal 코드를 가져올 수 있다.
// Java와 Kotlin에서의 protected도 서로 다르기 때문에 주의해야 한다.
// Kotlin은 protected가 붙어 있으면 선언된 클래스 또는 하위 클래스에서만 사용이 가능한 데에 반해,
// Java는 같은 패키지 또는 하위 클래스에서만 접근 가능해 같은 패키지에 있는 Kotlin protected 멤버에 접근할 수 있다.
class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
) {

    var price = _price
        private set

}
