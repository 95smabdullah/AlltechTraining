package Day5.CollectionsExample;

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare employees based on their IDs
        if (this.id < otherEmployee.id) {
            return -1;
        } else if (this.id > otherEmployee.id) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create a TreeSet of Employee objects
        TreeSet<Employee> employees = new TreeSet<>();

        // Add employees to the TreeSet
        employees.add(new Employee(1, "AB"));
        employees.add(new Employee(3, "CD"));
        employees.add(new Employee(2, "ef"));

        // Print the sorted employees
        for (Employee employee : employees) {
            System.out.println(employee.id+" "+employee.name);
        }
    }
}
