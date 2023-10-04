package lec15.코틀린에서_배열과컬렉션을_다루는_방법;

import java.util.HashMap;
import java.util.Map;

public class Lec15Main {

    public static void main(String[] args) {
        // JDK 8까지
        Map<Integer, String> oldmap = new HashMap<>();
        oldmap.put(1, "one");
        oldmap.put(2, "two");

        // JDK 9부터
        Map<Integer, String> newMap = Map.of(1, "one", 2, "two");

//        for (int key : oldmap.keySet()) {
//            System.out.println(key);
//            System.out.println(oldmap.get(key));
//        }
//
//        for (String value : oldmap.values()) {
//            System.out.println(value);
//        }
//
//        for (Map.Entry<Integer, String> entry : oldmap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
