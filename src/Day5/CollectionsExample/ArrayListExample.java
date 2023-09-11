package Day5.CollectionsExample;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
            for(int i=1;i<=100;i++){

                list.add(i);
            }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(4);
            list2.add(111);
            list2.add(222);
            list2.add(333);
        list.addAll(2,list2);
        System.out.println(list);

            if(list.contains(222)){
                System.out.println("list2 wass added");
            }
            else System.out.println("list 2 wasnt added");
            Integer a=222;
            list.remove(a);

        if(list.contains(222)){
            System.out.println("222 wasnt removed");
        }
        else System.out.println("222 was removed");

        System.out.println(list);





    }
}
