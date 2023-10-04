package lec17.코틀린에서_람다를_다루는_방법;

public class Fruit {

    private final String name;
    private final int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
