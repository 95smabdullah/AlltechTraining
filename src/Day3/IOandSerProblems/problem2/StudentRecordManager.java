package Day3.IOandSerProblems.problem2;

import java.io.*;
import java.util.*;


class BlankFieldException extends Exception {
    public BlankFieldException(String fieldName) {
        super(fieldName + " cannot be blank.");
    }
}


class NonNumericValueException extends Exception {
    public NonNumericValueException(String fieldName) {
        super(fieldName + " must be a numeric value.");
    }
}


class Student implements Serializable {
    public int rollNumber;
    public String name;
    public int age;
    public String address;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }


}

public class StudentRecordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            try {
                System.out.print("Enter Roll Number (numeric): ");
                String rollNumberStr = sc.nextLine();
                if (rollNumberStr.isEmpty()) {
                    throw new BlankFieldException("Roll Number");
                }
                int rollNumber = Integer.parseInt(rollNumberStr);
                if (rollNumber < 0) {
                    throw new NonNumericValueException("Roll Number");
                }

                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new BlankFieldException("Name");
                }

                System.out.print("Enter Age (numeric): ");
                String ageStr = sc.nextLine();
                if (ageStr.isEmpty()) {
                    throw new BlankFieldException("Age");
                }
                int age = Integer.parseInt(ageStr);
                if (age < 0) {
                    throw new NonNumericValueException("Age");
                }

                System.out.print("Enter Address: ");
                String address = sc.nextLine();
                if (address.isEmpty()) {
                    throw new BlankFieldException("Address");
                }

                Student student = new Student(rollNumber, name, age, address);
                students.add(student);

                System.out.print("Do you wish to save these records? Y/N: ");
                String response = sc.nextLine();

                if (!response.equalsIgnoreCase("N")) saveRecordsToFile(students);

                System.out.print("Do you wish to add more records? Y/N: ");
                response = sc.nextLine();

                if (response.equalsIgnoreCase("N")) break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid numeric input. Please try again.");
            } catch (BlankFieldException | NonNumericValueException e) {
                System.out.println(e.getMessage());
            }

        }



    }

    private static void saveRecordsToFile(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./student_records.ser"))) {
            oos.writeObject(students);
            System.out.println("Student records saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
