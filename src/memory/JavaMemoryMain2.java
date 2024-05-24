package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        //스택 구조
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1(){
        System.out.println("method1 start");
       Data data1 = new Data(10);
       method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2){
        System.out.println("method2 start");
        System.out.println("Data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}
