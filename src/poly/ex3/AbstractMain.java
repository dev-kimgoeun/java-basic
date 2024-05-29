package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(pig);
    }

    public static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물소리");
        animal.sound();
        System.out.println("동물소리끝");
    }
}
