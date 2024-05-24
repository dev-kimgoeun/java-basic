package static1;

import java.sql.SQLOutput;

public class DataCountMain3 {

    public static void main(String[] args) {

       Data3 data1 = new Data3("A");
        System.out.println("A COUNT = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B COUNT = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C COUNT = " + Data3.count);


        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //보통은 이렇게 하지 않음 사용하는 사람은 count가 인스턴스 변수에 있다고 착각할 여지가 있음

        //클래스를 통한 접근
        System.out.println(Data3.count);

    }

}
