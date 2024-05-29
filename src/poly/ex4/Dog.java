package poly.ex4;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("왕왕왕");
    }

    @Override
    public void move() {
        System.out.println("개가 지나가요 ");

    }
}
