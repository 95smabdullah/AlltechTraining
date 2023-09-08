package Day2.problem2;

import java.util.ArrayList;
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args){
        ArrayList<Compartment> compartmentArrayList = new ArrayList<>(10);
        Random random = new Random();
        int[] s = {0,1,2,3,4,5,6,7,8,9};
        for(int j: s){
            int randomInteger = random.nextInt(4)+1;
            switch (randomInteger) {
                case 1 -> {
                    Compartment c1 = new FirstClass();
                    compartmentArrayList.add(c1);
                }
                case 2 -> {
                    Compartment c2 = new Ladies();
                    compartmentArrayList.add(c2);
                }
                case 3 -> {
                    Compartment c3 = new General();
                    compartmentArrayList.add(c3);
                }
                case 4 -> {
                    Compartment c4 = new Luggage();
                    compartmentArrayList.add(c4);
                }
            }
    }
        for(Compartment c: compartmentArrayList){
            c.notice();
        }

    }
}
