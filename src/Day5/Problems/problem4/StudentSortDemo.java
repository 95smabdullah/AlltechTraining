package Day5.Problems.problem4;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(1,"Ilhan"));
        studentArrayList.add(new Student(2,"brian"));
        studentArrayList.add(new Student(3,"zeno"));
        studentArrayList.add(new Student(4,"1ba"));
        studentArrayList.add(new Student(5,"Abdullah"));


            System.out.println(studentArrayList.toString());

        Collections.sort(studentArrayList);
        System.out.println(studentArrayList.toString());




    }
}
