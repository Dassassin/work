package day16.problem03;

import java.util.Random;
import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Callable c = new Callable() {
            @Override
            public Integer call() {
                Random r = new Random();
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += r.nextInt(100)+1;
                }
                System.out.println("该线程的平均数为："+sum/10);
                return sum/10;
            }
        };
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            Future f = service.submit(c);
            try {
                sum += Integer.parseInt(String.valueOf(f.get()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("三个线程的平均数为："+sum/3);
    }
}
