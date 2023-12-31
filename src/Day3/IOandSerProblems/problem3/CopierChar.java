package Day3.IOandSerProblems.problem3;

import java.io.*;
import java.util.Scanner;

public class CopierChar {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file name");
        String srcFileName = sc.next();
        System.out.println("Enter destination file name");
        String opt = "Y";
        String desFileName = sc.next();
        File opFile = new File("./test/"+desFileName);
        if(opFile.exists()){
            System.out.println("There is already a file named "+desFileName+"Do you wish to overwite? Y/N");
            opt = sc.next();
        }
        if(opt.equalsIgnoreCase("Y")){
            System.out.println("continuing with copying");
            try (
                    FileReader fr = new FileReader("./test/"+srcFileName);
                    FileWriter fw = new FileWriter("./test/"+desFileName)
            ) {
                int i;
                while((i = fr.read())!=-1){
                    fw.write(i);
                }

            } catch (IOException e){
                System.out.println("The src file does not exist ");
                e.printStackTrace();
            }
        } else System.out.println("Copying terminated");




    }
}
