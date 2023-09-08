package Day3.IOandSerProblems.problem7;


import java.io.*;

public class ExternalizedCDRProgram {
    public static void main(String[] args) {
        // Accept input from the user
        String A_Number = getUserInput("Enter A_Number: ");
        String B_Number = getUserInput("Enter B_Number: ");
        int duration = Integer.parseInt(getUserInput("Enter call duration (minutes): "));

        // Create a CDR object and calculate the charge
        ExternalizedCDR cdr = new ExternalizedCDR(A_Number, B_Number, duration);

        // Serialize the ExternalizedCDR object to rated_cdr.txt
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("rated_externalized_cdr.txt"))) {
            objectOutputStream.writeObject(cdr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the ExternalizedCDR object from rated_cdr.txt
        ExternalizedCDR deserializedCDR = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("rated_externalized_cdr.txt"))) {
            deserializedCDR = (ExternalizedCDR) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Display the ExternalizedCDR object information
        System.out.println("Original CDR Information:");
        System.out.println(cdr);

        System.out.println("\nDeserialized CDR Information:");
        if (deserializedCDR != null) {
            System.out.println(deserializedCDR);
        } else {
            System.out.println("Failed to deserialize CDR.");
        }
    }

    private static String getUserInput(String prompt) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
