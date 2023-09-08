package Day3.ObjectSerializeDemo;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", 50000.0, 1236789);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C://Users/sabdu/emp1.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee serialized to " + "emp1.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C://Users/sabdu/emp1.ser"))) {
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

