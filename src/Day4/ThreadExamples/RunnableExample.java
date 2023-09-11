package Day4.ThreadExamples;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("i: " + i + "\t");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RunnableExample cp = new RunnableExample();
        Thread t = new Thread(cp);
        t.start();
        for(int j=0;j<20;j++) {
            System.out.println("j: " + j + "\t");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
