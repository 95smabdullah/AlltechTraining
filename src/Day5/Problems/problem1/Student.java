package Day5.Problems.problem1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
    static String prompt = "Enter name";
    private ArrayList<String> names = new ArrayList<>(1);
    public void setNames(){
        String prompt = "Enter name";
        while(true) {
            System.out.println("Do you wish to add student name? Y/N");
            if(new Scanner(System.in).next().equalsIgnoreCase("y")){
                String name = getUserInput(prompt);
                names.add(name);
        } else break;
        }


    }

    public void searchName(){
        String name = getUserInput(prompt);
        System.out.println(names.contains(name));
    }

    public void printNames(){
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    public void removeName(String stuName){

        names.remove(stuName);
        System.out.println(names);

    }


    public String getUserInput(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in).next();
    }
}
