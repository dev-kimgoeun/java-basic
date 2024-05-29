package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {

        InterfaceA A = new Child();
        A.methodA();
        A.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
    }
}
