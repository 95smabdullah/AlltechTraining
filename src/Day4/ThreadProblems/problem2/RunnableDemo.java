package Day4.ThreadProblems.problem2;

public class RunnableDemo{
    public static void main(String[] args) {
//        MyRunnableThread mrt1 = new MyRunnableThread();
//        MyRunnableThread mrt2 = new MyRunnableThread();
        Thread mt1 = new Thread(new MyRunnableThread());
        Thread mt2 = new Thread(new MyRunnableThread());
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
