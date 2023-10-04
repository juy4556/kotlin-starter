package lec14.코틀린에서_다양한클래스를_다루는_방법;

public class Lec14Main {

    public static void main(String[] args) {
        handleCountry(JavaCountry.KOREA);
    }

    private static void handleCountry(JavaCountry country) {
        if (country == JavaCountry.KOREA) {
            // logic
        }

        if (country == JavaCountry.AMERICA) {
            // logic
        }
    }
}
