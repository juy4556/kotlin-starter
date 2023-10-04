package lec17.코틀린에서_람다를_다루는_방법

import java.io.BufferedReader
import java.io.FileReader

// 코틀린에선 try-with-resource 구문 사라짐
// 대신 inline 확장함수 use를 사용함
/*
    use함수를 타고 들어가보면
    public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R {
    이처럼 Closeable 구현체 T에 대한 확장함수임을 알 수 있다.
    또한, inline함수이다.
    block이라는 매개변수를 갖는데 이는 (T타입의 파라미터가 들어가고, R타입이 반환되는 람다)를 받게 만들어진 함수이다.
 */
fun readFile(path: String) {
    // 실제 use의 아규먼트에도 람다함수가 전달된다.
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
