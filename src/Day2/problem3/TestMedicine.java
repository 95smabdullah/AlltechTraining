package Day2.problem3;

import Day2.problem2.*;

import java.util.ArrayList;
import java.util.Random;

public class TestMedicine {
    public static void main(String[] args){
        ArrayList<Medicine> medicineArrayList = new ArrayList<>(10);
        Random random = new Random();
        int[] s = {0,1,2,3,4,5,6,7,8,9};
        for(int j: s){
            int randomInteger = random.nextInt(3)+1;
            switch (randomInteger) {
                case 1 -> {
                    Medicine m1 = new Tablet("gsk", "Boston,MA", "Take 1 daily");
                    medicineArrayList.add(m1);
                }
                case 2 -> {
                    Medicine m2 = new Syrup("novartis", "Buffalo,NY", "Take 100ml daily");
                    medicineArrayList.add(m2);
                }
                case 3 -> {
                    Medicine m3 = new Ointment("gsk", "Andover,MA", "Apply twice daily");
                    medicineArrayList.add(m3);
                }
            }
        }
        for(Medicine m: medicineArrayList){
            m.displayLabel();
        }
    }
}
