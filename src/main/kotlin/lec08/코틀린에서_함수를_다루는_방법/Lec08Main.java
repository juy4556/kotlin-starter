package lec08.코틀린에서_함수를_다루는_방법;

public class Lec08Main {

    public static void main(String[] args) {

    }

    public static void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }


    // 가변인자 ... 사용
    public static void printAll(String... strings) {
        for (String str: strings) {
            System.out.println(str);
        }
    }
}