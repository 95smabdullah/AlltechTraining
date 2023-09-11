package Day4.ThreadExamples.SynchronizedDemo;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;
    public MyThread(DisplayMessage dm, String name){
        this.dm = dm;
        this.name = name;
    }
    @Override
    public void run(){
        dm.sayHello(name);

    }
}
