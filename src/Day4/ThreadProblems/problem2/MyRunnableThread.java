package Day4.ThreadProblems.problem2;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i+" This is Runnable Thread: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
