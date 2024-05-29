package poly.ex5;

public class Dog implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("뭥뭥");
    }

    @Override
    public void move() {
        System.out.println("토도도도돋");
    }
}
