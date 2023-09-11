package Day5.Problems.problem1;

public class ArrayListDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setNames();
        s.searchName();
        s.printNames();
        String name = s.getUserInput("Name to delete");
        s.removeName(name);

    }
}
