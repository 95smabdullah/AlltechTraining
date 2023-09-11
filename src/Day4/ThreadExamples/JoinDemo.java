package Day4.ThreadExamples;

import java.util.Scanner;

public class JoinDemo extends Thread{
    static int n, sum = 0;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Sum of First N numbers");
        System.out.println("Enter value for N");
        n = new Scanner(System.in).nextInt();
        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sum:"+JoinDemo.sum);
        long end = System.currentTimeMillis();
        System.out.println("Time Taken: "+(end-start)/1000+"s");
    }
public void run(){
        for(int i=1;i<=JoinDemo.n;i++){
            sum+=i;
        }
}
}
