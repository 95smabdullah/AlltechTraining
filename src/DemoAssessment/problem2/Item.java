package DemoAssessment.problem2;

import java.util.ArrayList;

public class Item{
    int itemId;
    String itemName;
    static ArrayList<Item> itemArrayList;
    public Item(int itemId, String itemName){
        this.itemId = itemId;
        this.itemName = itemName;
    }
    @Override
    public String toString(){
        System.out.println("Item Id: "+ this.itemId);
        System.out.println("Item Name: "+ this.itemName);
        return null;
    }



    public static void main(String[] args) {
        itemArrayList = new ArrayList<>(5);
        Writer w = new Writer(itemArrayList);
        Printer p = new Printer(itemArrayList);
        w.start();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        p.start();


    }
}
