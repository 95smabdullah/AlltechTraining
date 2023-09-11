package Day3.IOandSerProblems.problem2;


import java.io.*;
import java.util.*;

// Serializable Student class to read student records


public class DisplayStudentRecords {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./test/student_records.ser"))) {
            List<Student> students = (List<Student>) ois.readObject();

            if (students.isEmpty()) {
                System.out.println("No student records found.");
            } else {
                System.out.println("Student Records:");
                for (Student student : students) {
                    System.out.println("Roll Number: " + student.rollNumber);
                    System.out.println("Name: " + student.name);
                    System.out.println("Age: " + student.age);
                    System.out.println("Address: " + student.address);
                    System.out.println();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
