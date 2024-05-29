package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스 생성 불가

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

        soundMove(cat);
        soundMove(cow);
        soundMove(dog);
    }
    public static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물소리");
        animal.sound();
        System.out.println("동물소리끝");
    }

    public static void soundMove(InterfaceAnimal animal){
        System.out.println("동물이동");
        animal.move();
        System.out.println("동물이동끝");
    }
}
