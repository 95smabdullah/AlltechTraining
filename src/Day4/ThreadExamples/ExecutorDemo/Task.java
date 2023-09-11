package Day4.ThreadExamples.ExecutorDemo;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(("Task execution started"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("--------Task Completed");
    }
}
