package lec12.코틀린에서_object키워드를_다루는_방법;

public class Lec12Main {
    public static void main(String[] args) {
        /*
        // @JVMstatic 코틀린에 안붙여줬을 때
//        Person person = Person.Factory.newBaby("아가");
        // @JVMstatic 붙여줬을 때 메서드에 바로 접근 가능
        Person person = Person.newBaby("아기");
        Person.Factory.log();
        System.out.printf("이름은 %s, 나이는 %d", person.getName(), person.getAge());
        */
        // 익명 클래스 예시
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("moving~~");
            }
            @Override
            public void fly() {
                System.out.println("flying~~");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}
