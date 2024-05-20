package oop1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(3000);
        account.withdraw(9000);
        account.showBalance();
    }
}
