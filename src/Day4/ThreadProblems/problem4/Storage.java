package Day4.ThreadProblems.problem4;

public class Storage {
    static int number;
    static boolean  isValueAvailable = false;
    public synchronized void setNumber(int n){
        while(isValueAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        number = n;
        isValueAvailable = true;
        notify();
    }
    public synchronized void displayNumber(){
        while (!isValueAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("The number now is: "+number);
        isValueAvailable = false;
        notify();
    }
}
