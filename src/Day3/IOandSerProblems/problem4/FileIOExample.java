package Day3.IOandSerProblems.problem4;

import java.io.*;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        String fileName = "io.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(userInput);
            fileWriter.close();
            File file = new File(fileName);
            long fileSize = file.length();
            System.out.println("Size of the file " + fileName + " is " + fileSize + " bytes.");
            FileReader fileReader = new FileReader(fileName);
            int line;
            System.out.println("Contents of the file:");
            while ((line = fileReader.read()) != -1) {
                System.out.print((char)line);
            }
            fileReader.close();
            if (file.delete()) {
                System.out.println("File " + fileName + " has been deleted successfully.");
            } else {
                System.out.println("Failed to delete the file " + fileName);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

