package day16.problem04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Thread t1 = new Thread(() -> {
            int x = 1;
            for (int i = 1; i <= 10; i++) {
                x *= i;
            }
            System.out.println("10!="+x);
        });
        Thread t2 = new Thread(() -> {
            int x = 1;
            for (int i = 1; i <= 5; i++) {
                x *= i;
            }
            System.out.println("5!="+x);
        });
        Thread t3 = new Thread(() -> {
            int x = 1;
            for (int i = 1; i <= 8; i++) {
                x *= i;
            }
            System.out.println("8!="+x);
        });
        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
    }
}
