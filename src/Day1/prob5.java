package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class prob5 {
    public static void main(String[] args){

        String[] wrdlist = new String[5];

        for(int j=0;j<5;j++){
            System.out.println("Enter a word");

            Scanner sc = new Scanner(System.in);
            String wrd = sc.nextLine();

            String revrsd = "";

            for(int i = wrd.length()-1; i>=0; i--){
                revrsd = revrsd + wrd.charAt(i);
            }

            wrdlist[j] = revrsd;



        }
        String[] test = new String[5];

        Arrays.sort(wrdlist);
        for(String res: wrdlist){
            System.out.println(res);
        }



    }
}
