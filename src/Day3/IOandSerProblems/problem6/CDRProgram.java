package Day3.IOandSerProblems.problem6;

import java.io.*;
import java.util.Scanner;

public class CDRProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A_Number: ");
        String A_Number = sc.next();
        System.out.println("Enter B_Number: ");
        String B_Number = sc.next();
        System.out.println("Enter call duration (minutes): ");
        int duration = Integer.parseInt(sc.next());


        CDR cdr = new CDR(A_Number, B_Number, duration);


        try (FileWriter writer = new FileWriter("..calculatedCharge.txt")) {
            writer.write("Calculated Charge: $" + cdr.calculatedCharge);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("rated_cdr.txt"))) {
            objectOutputStream.writeObject(cdr);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("CDR Information:");
        System.out.println(cdr);
    }
}

