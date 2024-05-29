package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        //다운캐스팅을 자동으로 하지 않는 이유

        Parent parent = new Child();
        Child child = (Child) parent;
        child.childMethod();
        child.parentMethod();

        Parent parent1 = new Parent();
        Child child1 = (Child) parent1; //런타임오류 - ClassCastException
        child1.childMethod(); //실행불가
    }
}
