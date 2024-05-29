package poly.ex4;


public class Pig extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지도 지나가네요");
    }
}
