package Day4.ThreadProblems.problem4;

public class TestStorage {
    public static void main(String[] args) {
        Storage s = new Storage();
        Thread c = new Counter(s);
        Thread p = new Printer(s);
        c.start();
        p.start();


    }
}
