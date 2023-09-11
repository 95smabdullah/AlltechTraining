package DemoAssessment.problem2;

import java.util.ArrayList;


    public  class Writer extends Thread{

        ArrayList<Item> itemArrayList;
        public Writer(ArrayList<Item> itemArrayList){
            this.itemArrayList = itemArrayList;
        }
        @Override
        public void run() {

            itemArrayList.add(new Item(1,"book"));
            itemArrayList.add(new Item(2,"bag"));
            itemArrayList.add(new Item(3,"pen"));
            itemArrayList.add(new Item(4,"shoe"));
            itemArrayList.add(new Item(5,"uniform"));
        }
    }




