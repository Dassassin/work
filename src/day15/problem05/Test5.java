package day15.problem05;

import java.util.HashSet;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();
        while (set.size() < 10){
            set.add(r.nextInt(100)+1);
        }
        new Runnable() {
            public void run() {
                for (int i:set) {
                    System.out.println("第"+i+"号正在通过山洞");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.run();
    }
}
