package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow caw = new Cow();
        Duck duck = new Duck();

        Animal[] arr  = {dog, cat, caw, duck};

        //변하지 않는 부분
        for (Animal animal : arr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
