package Day5.Problems.problem4;

public class Student implements Comparable<Student>{
    private int rollNo;
    private String name;


    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return "RollNo: "+this.rollNo+ " Name "+ this.name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.name);
    }
}
