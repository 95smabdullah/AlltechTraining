package Assessment1.Q2;

import java.io.*;
import java.util.Scanner;

public class StoreEmployee{

    //Class Method to get user inputs
    public static String getInput(String prompt){
        System.out.println(prompt);
        return new Scanner(System.in).next();
    }
    public static void main(String[] args) {

        //Getting Employee details from User
        System.out.println("Enter Employee details.\n\n");
            int empId = Integer.parseInt(getInput("Enter Employee ID"));
            String empName = getInput("Enter Employee Name");
            int deptNo = Integer.parseInt(getInput("Enter Employee Department No."));

            //Creating Employee Object with received Input
            Employee e = new Employee(empId,empName,deptNo);

            //Get saveFile Name
            String svFile = getInput("Enter Save File Name");

       //Serialize Object and save in File
       try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./"+svFile+".ser"))) {
           oos.writeObject(e);
       } catch (IOException ex) {
           throw new RuntimeException(ex);
       }
       //DeSerialize Object and read from File
       try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./"+svFile+".ser"))){
           System.out.println(ois.readObject().toString());
       } catch (IOException | ClassNotFoundException ex) {
           throw new RuntimeException(ex);
       }

    }
}
