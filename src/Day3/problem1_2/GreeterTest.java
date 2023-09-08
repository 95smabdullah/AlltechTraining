package Day3.problem1_2;

import Day3.problem1.Advisor;
import Day3.problem1.Greeter;

import java.util.ArrayList;
import java.util.Scanner;

public class GreeterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Greeter> greeterArrayList = new ArrayList<>();
        String name;
        while(true) {

            System.out.println("Enter a name or Stop to stop");
            name = sc.next();

            if (!name.equalsIgnoreCase("stop")){
                Greeter g = new Greeter(name);
                greeterArrayList.add(g);
            } else {
                break;
            }
        }

        for (Greeter g : greeterArrayList) {
            System.out.println(g.sayHello());
        }

        Advisor ad = new Advisor();
        System.out.println(ad.getAdvice());
        for (int i = greeterArrayList.size() - 1; i >= 0; i--) {
            greeterArrayList.get(i).sayGoodBye();
        }


    }
}
