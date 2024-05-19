package ref;

import java.util.Scanner;

public class ProductOrderMainRef2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //여러 상품의 주문 정보를 담는 배열 생성
        System.out.print("입력할 주문의 개수를 입력하세요. :");
        int num = sc.nextInt();
        sc.nextLine();

        ProductOrderRef [] products = new ProductOrderRef[num];

        for(int i=0; i<products.length; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요. ");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            products[i] = createOrder(productName, price, quantity);
        }
//
//        //createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
//        products[0] = createOrder("두부", 2000, 2);
//        products[1] = createOrder("김치", 5000, 1);
//        products[2] = createOrder("콜라", 1500, 2);
//


        //printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(products);

        //getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(products);

        //총 결제 금액 출력
        System.out.println("총 결제 금액 : "+ totalAmount);
    }

    static ProductOrderRef createOrder (String ProductName, int price, int quantity){
        ProductOrderRef product = new ProductOrderRef();
        product.productName = ProductName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrderRef[] products){
        for (ProductOrderRef product : products) {
            System.out.println("상품명 : "+product.productName +", 가격: "+ product.price + ", 수량 : "+ product.quantity);
        }
    }

    static int getTotalAmount(ProductOrderRef[] products){
        int totalAmount = 0;
        for (ProductOrderRef product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }
}
