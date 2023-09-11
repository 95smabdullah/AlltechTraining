package Day4.ThreadExamples;

public class MultiThreaded extends Thread{
    public static void main(String[] args){
        MultiThreaded mt1 = new MultiThreaded();
        mt1.setPriority(MAX_PRIORITY);
        mt1.setName("mt1");
        mt1.start();
        MultiThreaded mt2 = new MultiThreaded();
        mt2.setPriority(MIN_PRIORITY);
        mt2.setName("mt2");
        mt2.start();
        for(int j = 1;j<20;j++) {
            System.out.println(Thread.currentThread().getName() + ": " + j + "\t");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread exiting");
            }
        }
    }
    @Override
    public void run(){
        System.out.println("Thread name:"+Thread.currentThread().getName());
        for (int i=1; i<=20; i++){
            System.out.println(Thread.currentThread().getName()+": "+i+"\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child thread exiting");
            }
        }
    }
}
