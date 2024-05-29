package poly.ex5;

public class Cow implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("음메에엥");
    }

    @Override
    public void move() {
        System.out.println("통토오토토오");
    }
}
