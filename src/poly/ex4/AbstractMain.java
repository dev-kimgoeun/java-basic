package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(pig);

        soundMove(dog);
        soundMove(cat);
        soundMove(pig);
    }

    public static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물소리");
        animal.sound();
        System.out.println("동물소리끝");
    }

    public static void soundMove(AbstractAnimal animal){
        System.out.println("동물이동");
        animal.move();
        System.out.println("동물이동끝");
    }
}
