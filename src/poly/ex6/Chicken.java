package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("꼭꼬");
    }

    @Override
    public void fly() {
        System.out.println("꼬꼬 날다~");
    }
}
