package Day4.ThreadExamples.ExecutorDemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorPool {
    public static void main(String[] args) {


        try (ExecutorService e = Executors.newFixedThreadPool(5)) {
            System.out.println("Thread submitting task " + Thread.currentThread().getName());
            for (int i = 1; i <= 3; i++) {
                e.execute(new Task());
            }
        }
    }
}
