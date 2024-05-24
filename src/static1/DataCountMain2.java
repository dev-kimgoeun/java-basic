package static1;

import memory.Data;

public class DataCountMain2 {

    public static void main(String[] args) {

    Counter counter = new Counter();
    Data2 data1 = new Data2("A", counter);
    System.out.println("A counter = " + counter.count);

    Data2 data2 = new Data2("B", counter);
    System.out.println("B counter = "+ counter.count);

    Data2 data3 = new Data2("C", counter);
    System.out.println("C counter = "+ counter.count);
    }

}
