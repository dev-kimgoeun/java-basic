package oop1;

public class Account {
    int balance; //잔액

    void deposit(int amount){
        balance+= amount;
        System.out.println(amount +"원을 입급합니다.");
    }

   void withdraw (int amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println(amount +"원을 출금합니다.");

        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }

    void showBalance (){
        System.out.println("잔고 : " + balance);
    }

}
