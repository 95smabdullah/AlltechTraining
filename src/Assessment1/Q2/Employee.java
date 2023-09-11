package Assessment1.Q2;

import java.io.Serializable;

public class Employee implements Serializable { //Implement Serializable for saving to and reading from file later
    public int empId, deptNo;
    String empName;

    //Constructor
    public Employee(int empId, String empName, int deptNo) { // Constructor
        this.setEmpId(empId);
        this.setDeptNo(deptNo);
        this.setEmpName(empName);
    }

    //Setters and Getters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    //Override toString Method for displaying Employee object Details
    @Override
    public String toString(){
        return "Deserialised Employee Details:\n ID: "+this.getEmpId()+" Name: "+this.getEmpName()+" Department Number: "+this.getDeptNo();
    }
}
