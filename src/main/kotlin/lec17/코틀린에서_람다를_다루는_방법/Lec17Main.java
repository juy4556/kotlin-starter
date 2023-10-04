package lec17.코틀린에서_람다를_다루는_방법;


import java.util.ArrayList;
import java.util.List;


public class Lec17Main {

    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>(List.of(new Fruit("사과", 1_000),
                new Fruit("사과", 2_000),
                new Fruit("사과", 3_000),
                new Fruit("사과", 4_000),
                new Fruit("바나나", 1_000),
                new Fruit("바나나", 2_000),
                new Fruit("바나나", 3_000),
                new Fruit("수박", 1_000)));

        String targetFruitName = "사과";
        targetFruitName = "바나나";
        // targetFruitName 밑에 빨간줄
        // Variable used in lambda expression should be final or effectively final
        // 즉, 자바에서는 람다를 쓸 때, 람다 밖에 있는 변수를 쓰는 경우 final인 변수만 사용할 수 있는 제약이 있다.
        // 코틀린에서는 이를 Closure라는 데이터 구조를 사용해 람다를 진정한 일급시민으로 간주하여 해결한다!
//        filterFruits(fruits, (fruit -> {targetFruitName.equals(fruit.getName())}));
    }
}
