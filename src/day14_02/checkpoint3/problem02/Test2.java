package day14_02.checkpoint3.problem02;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        new Thread(()->{
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int r = new Random().nextInt(1000)+100;
                sum+=r;
            }
            System.out.println(sum);
        }).run();
    }
}
