package Day1;

import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        int[] list = {4,17,26,33,49};
        Scanner sc = new Scanner(System.in);
        int num=99;
        boolean chk = false;
        while(!chk) {
            System.out.println("please enter a number between 1 - 50");

        int m = sc.nextInt();
        if(m>=1 & m <=50) {
            chk = true;
            num = m;
        }

        }
        for(int i=0; i<5; i++){
            if(num==list[i]){
                System.out.println("BINGO");
            }
        }





    }
}

