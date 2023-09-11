package Day5.Problems.problem2;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private Map<Integer,String> empNames = new HashMap<>();


    public void setEmpName(Integer empNo, String empName) {
        empNames.put(empNo,empName);
    }

    public void printEmpNames(){
        System.out.println("Employee Names: "+empNames.values());
    }

    public void getName(Integer empNo){
        System.out.println("Employee with EmpNo:"+empNo+" : "+empNames.get(empNo));
    }

    public void priintNamesKeySet(){
        for(Integer i: empNames.keySet()){
            System.out.println(empNames.get(i));
        }
    }

    public void printSize(){
        System.out.println("Size of Employee Map: "+empNames.size());
    }

    public void remove(Integer empNo){
        empNames.remove(empNo);
        System.out.println("employee records of employee number "+empNo+" deleted");
    }
}
