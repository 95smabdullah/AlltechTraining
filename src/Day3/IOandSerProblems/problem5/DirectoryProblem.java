package Day3.IOandSerProblems.problem5;


import java.io.File;
import java.util.Scanner;

public class DirectoryProblem {
    public static void main(String[] args) {
        System.out.print("Enter a directory path: ");
        Scanner sc = new java.util.Scanner(System.in);
        String directoryName = sc.next();
        File directory = new File(directoryName);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Directory doesn't exist.");
        }
    }
}

