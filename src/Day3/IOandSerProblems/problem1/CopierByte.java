package Day3.IOandSerProblems.problem1;

import java.io.*;

import java.util.Scanner;

public class CopierByte {
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
                    FileInputStream fis = new FileInputStream("./test/"+srcFileName);
                    FileOutputStream fos = new FileOutputStream("./test/"+desFileName)
            ) {
                int i;
                while((i = fis.read())!=-1){
                    fos.write(i);
                }

            } catch (IOException e){
                System.out.println("The src file does not exist ");
                e.printStackTrace();
            }
        } else System.out.println("Copying terminated");




    }
}
