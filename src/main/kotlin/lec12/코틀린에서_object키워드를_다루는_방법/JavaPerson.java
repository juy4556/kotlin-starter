package lec12.코틀린에서_object키워드를_다루는_방법;

public class JavaPerson {

    private static final int MIN_AGE = 1;
    private String name;
    private int age;

    public static JavaPerson newBaby(String name) {
        return new JavaPerson(name, MIN_AGE);
    }

    private JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
