package Day5.Problems.problem2;

public class TestHashMap {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpName(1, "Abdullah");
        e.setEmpName(1, "Abdullahcp");
        e.setEmpName(2, "asasf");
        e.setEmpName(3, "asdadfs");
        e.printEmpNames();
        e.getName(1);
        e.printSize();

        e.priintNamesKeySet();
        e.remove(1);
        e.printEmpNames();

    }
}
