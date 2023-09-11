package Day4.ThreadProblems.problem1;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.start();
        mt2.start();
        for(int i=1;i<=10;i++){
            System.out.println(i+" This is Thread: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
