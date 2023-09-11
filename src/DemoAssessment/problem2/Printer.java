package DemoAssessment.problem2;

import java.util.ArrayList;

public class Printer extends Thread {
    ArrayList<Item> itemArrayList;

    public Printer(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @Override
    public void run() {
        for (Item i : itemArrayList) {
            i.toString();
        }
    }
}
