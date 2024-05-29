package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {

        //upcasting vs downcasting

        Child child = new Child();
        Parent parent1 = child;  //업캐스팅은 생략가능, 생략 권장

        parent1.parentMethod();

    }
}
