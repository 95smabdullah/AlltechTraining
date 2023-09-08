package Day1;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        int[] list = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("please enter number");
            list[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum=sum+list[i];
        }
        float avg = (float) sum /5;
        System.out.println("Sum of numbers = "+sum);
        System.out.println("average of numbers = "+ avg);
        int count = 0;
        for(int i = 0; i<5; i++){
            if(list[i] < avg){
                count++;
            }
        }
        System.out.println("no. of values less than avg are = " + count);



    }
    }

