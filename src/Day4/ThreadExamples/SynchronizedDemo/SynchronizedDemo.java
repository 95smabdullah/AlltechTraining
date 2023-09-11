package Day4.ThreadExamples.SynchronizedDemo;

public class SynchronizedDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread(dm,"Mark");
        MyThread t2 = new MyThread(dm,"Zuck");
        t1.start();
        t2.start();

    }
}
