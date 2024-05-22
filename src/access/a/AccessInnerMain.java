package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {

        AccessData data = new AccessData();
        //public 호출
        data.publicField = 1;
        data.publicMethod();

        //default 호출
        data.defaultField=2;
        data.defaultMethod();

        //private
//        data.privateFiedl = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
