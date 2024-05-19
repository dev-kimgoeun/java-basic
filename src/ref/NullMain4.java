package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data  = new Data(); //참조값 생성

        System.out.println("bigdata.count = " + bigData.count); //0
        System.out.println("bigdata.data = " + bigData.data); // 참조값

        System.out.println("bigdata.data.value = " + bigData.data.value); //0
    }
}
