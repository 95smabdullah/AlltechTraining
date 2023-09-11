package Day4.ThreadProblems.problem3;

public class PriorityDemo {
    static class MyThread extends Thread{
        public void run(){
            for(int i=0;i<20;i++) {
                System.out.println("This is Thread " + Thread.currentThread().getName() + "with priority:" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        Thread.sleep(5000);
        t1.start();
    }
}
