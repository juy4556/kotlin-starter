package lec13.코틀린에서_중첩클래스를_다루는_방법

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    // 기본적으로 코틀린에선 바깥 클래스에 대한 연결이 없는 중첩 클래스가 만들어짐! GOOD!
    // 권장되지 않는 클래스 안의 클래스(inner class)를 만들 땐 클래스 앞에 inner 키워드 추가
    // 권장하지 않는 이유
    // 1. 내부 클래스는 숨겨진 외부 클래스 정보를 가져 참조를 해지하지 못하는 경우 메모리 누수가 생길 수 있고, 이를 디버깅하기 어렵다.
    // 2. 내부 클래스의 직렬화 형태가 명확하게 정의되지 않아 직렬화에 있어 제한이 있다.
    // 따라서 클래스 안에 클래스를 만들 땐 static 클래스를 사용하라!
    // 이 가이드를 코틀린에선 충실히 따라 자연스럽게 아래처럼 만들면 된다.
    // 기본적으로 바깥 클래스를 참조하지 않고, 바깥 클래스 참조 원할 시 inner키워드 추가
    class LivingRoom(
        private val area: Double
    ) {
        // 권장되지 않은 inner클래스 사용시 바깥클래스 참조 위해 this@바깥클래스 사용한다.
//        val address: String
//            get() = this@House.address
    }
}