package Day4.ThreadProblems.problem5;

import java.util.concurrent.*;

class RectangleCalculator implements Callable<Integer> {
    public int x;
    public int y;

    public RectangleCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() {
        return x * y;
    }
}

public class RectangleArea {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int x = 5;
        int y = 3;
        try (ExecutorService e = Executors.newSingleThreadExecutor()) {

            Future<Integer> future = e.submit(new RectangleCalculator(x, y));

            int area = future.get();
            System.out.println("Area of the rectangle: " + area);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
