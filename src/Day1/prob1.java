package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class prob1 {


    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter value for n ");
        int n = sc.nextInt();
        int l = n / 2 + 1;
//        System.out.println(l);
        List<Integer> result = new ArrayList<Integer>(l);
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(i);
//                System.out.println(i);
            }
        }
//            System.out.println(result.size());
            for (int j = 0; j < result.size(); j++) {
                System.out.println(result.get(j));
//        }


            }

    }}