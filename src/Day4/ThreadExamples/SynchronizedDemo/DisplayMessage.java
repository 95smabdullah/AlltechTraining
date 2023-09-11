package Day4.ThreadExamples.SynchronizedDemo;

public class   DisplayMessage {
    public synchronized void sayHello(String name){
        for (int i=1;i<=10;i++){
            System.out.println("Hi there "+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
