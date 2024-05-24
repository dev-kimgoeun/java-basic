package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형을 파이널로 선언하면 한번만 선언할 수 있음, 참조값을 바꿀 수 없음

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
