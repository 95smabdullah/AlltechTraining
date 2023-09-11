package Day4.ThreadProblems.problem4;

public class Printer extends Thread{
    Storage s;
    public Printer(Storage s) {
        this.s = s;
    }

    public void run(){
        for(int i=1;i<=30;i++){
            s.displayNumber();
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

}
