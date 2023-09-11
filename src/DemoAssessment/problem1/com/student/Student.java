package DemoAssessment.problem1.com.student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements StudentInt, Serializable {
    int rollNo;
    String name;
    int subject1, subject2, subject3,totalMarks;

    public Student(){
        this.readStudInfo();
    }

    @Override
    public void readStudInfo() {
        this.rollNo = Integer.parseInt(getUserInput("Enter Roll No"));
        this.name = getUserInput("Enter name");
        this.subject1 = Integer.parseInt(getUserInput("Enter Subject 1 marks"));
        this.subject2 = Integer.parseInt(getUserInput("Enter Subject 2 marks"));
        this.subject3 = Integer.parseInt(getUserInput("Enter Subject 3 marks"));
        this.totalMarks = this.calcTotal();


    }

    @Override
    public int calcTotal() {
        return this.subject1+this.subject2+this.subject3;


    }

    @Override
    public void printStudInfo(){
        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("./test/StudentInfo.txt")))){
            ois.readObject().toString();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public String toString(){
        System.out.println("Roll No: "+this.rollNo);
        System.out.println("Name: "+this.name);
        System.out.println("Subject 1: "+this.subject1);
        System.out.println("Subject 2: "+this.subject2);
        System.out.println("Subject 3: "+this.subject3);
        System.out.println("Total Marks: "+ this.totalMarks);

        return null;
    }



    public String getUserInput(String prompt){
        System.out.println(prompt);
        return(new Scanner(System.in).next());
    }
}
