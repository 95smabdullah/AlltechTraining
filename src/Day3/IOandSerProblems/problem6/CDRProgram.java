package Day3.IOandSerProblems.problem6;

import java.io.*;

public class CDRProgram {
    public static void main(String[] args) {

        String A_Number = getUserInput("Enter A_Number: ");
        String B_Number = getUserInput("Enter B_Number: ");
        int duration = Integer.parseInt(getUserInput("Enter call duration (minutes): "));


        CDR cdr = new CDR(A_Number, B_Number, duration);


        try (FileWriter writer = new FileWriter("calculatedCharge.txt")) {
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
        System.out.println(cdr.toString());
    }

    private static String getUserInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

