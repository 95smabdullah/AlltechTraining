package Day3.IOandSerProblems.problem7;


import java.io.*;
import java.util.Scanner;

public class ExternalizedCDRProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A_Number: ");
        String A_Number = sc.next();
        System.out.println("Enter B_Number: ");
        String B_Number = sc.next();
        System.out.println("Enter call duration (minutes): ");
        int duration = Integer.parseInt(sc.next());

        ExternalizedCDR cdr = new ExternalizedCDR(A_Number, B_Number, duration);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("rated_externalized_cdr.txt"))) {
            objectOutputStream.writeObject(cdr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExternalizedCDR deserializedCDR = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("rated_externalized_cdr.txt"))) {
            deserializedCDR = (ExternalizedCDR) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Original CDR Information:");
        System.out.println(cdr);

        System.out.println("\nDeserialized CDR Information:");
        if (deserializedCDR != null) {
            System.out.println(deserializedCDR);
        } else {
            System.out.println("Failed to deserialize CDR.");
        }
    }
}
