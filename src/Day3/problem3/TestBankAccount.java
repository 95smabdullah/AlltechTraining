package Day3.problem3;

import java.util.Scanner;

public class TestBankAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Enter Account Number");
            int accNo = sc.nextInt();
            System.out.println("Enter Name");
            String custName = sc.next();
            System.out.println("Enter Account Type Current or Savings");
            String accType = sc.next();
            System.out.println("Enter Initial deposit amount");
            float balance = sc.nextInt();
            BankAccount ba = new BankAccount(accNo,custName,accType,balance);
            System.out.println("please make a choice below");
//            System.out.println("1 - Create Account");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Check Balance");
            System.out.println("5 - Stop");
            choice = sc.nextInt();

            switch (choice) {
                case 2 -> {
                    System.out.println("Enter amount");
                    float depAmt = sc.nextInt();
                    ba.deposit(depAmt);
                }
                case 3 -> {
                    System.out.println("Enter amount");
                    float withAmt = sc.nextInt();
                    ba.withdraw(withAmt);
                }
                case 4 -> System.out.println(ba.getBalance());
            }
        } while (choice!=5);
    }
}
