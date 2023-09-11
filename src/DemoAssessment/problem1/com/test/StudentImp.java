package DemoAssessment.problem1.com.test;

import DemoAssessment.problem1.com.student.Student;
import DemoAssessment.problem1.com.student.StudentInt;

import java.io.*;

public class StudentImp {
    public static void main(String[] args) {
        StudentInt s = new Student();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./test/StudentInfo.txt"))){
            oos.writeObject(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        s.printStudInfo();



    }
}
