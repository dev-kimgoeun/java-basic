package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++; 인스턴스 변수 접근 오류
        //instanceMethod(); 인스턴스 메서드 접근 오류

        staticValue++; //정적변수 접근
        staticMethod(); //정적메서드 접근
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++; //정적변수 접근
        staticMethod(); //정적메서드 접근
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
