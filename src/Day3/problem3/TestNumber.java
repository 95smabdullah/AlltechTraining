package Day3.problem3;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int x = sc.nextInt();
        System.out.println("Enter the Second number");
        int y = sc.nextInt();
        Number n = new Number(x,y);
        int choice = 0;
        do{
            System.out.println("Make a choice between 1-5\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Stop");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    n.add();
                    System.out.println("Addition result is "+n.result);
                    break;
                case 2:
                    n.sub();
                    System.out.println("Subtraction result is "+n.result);
                    break;
                case 3:
                    n.mul();
                    System.out.println("Multiplication result is "+n.result);
                    break;
                case 4:
                    n.div();
                    System.out.println("Divison result is "+n.result);
                    break;
                    }
            }while(choice!=5);
        }
    }

