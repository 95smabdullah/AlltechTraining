package Day4.ThreadProblems.problem1;

public class MyThread extends Thread{
    @Override
    public void run() {
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
