package Day4.ThreadProblems.problem4;

public class Counter extends Thread{
    Storage s;
    public Counter(Storage s){
        this.s = s;

    }

    public void run(){
        for(int i=1;i<=30;i++){
            s.setNumber(i);
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

}
