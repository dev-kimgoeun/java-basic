package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        System.out.println("메서드 호출 전 data1.value = " + data1.value);
        changePrimitive(data1);
        System.out.println("메서드 호출 후 data1.value = " + data1.value);
    }

    static void changePrimitive (Data x){
        x.value = 20;
    }
}
