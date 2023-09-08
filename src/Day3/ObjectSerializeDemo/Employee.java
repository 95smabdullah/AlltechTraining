package Day3.ObjectSerializeDemo;

import java.io.Serializable;

class Employee implements Serializable {
    public int id;
    public String name;
    public double salary;
    public int ssn;

    public Employee(int id, String name, double salary, int ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }


}
