package day15.problem09;

public class Test9 {
    public static void main(String[] args) {
        new Runnable() {
            @Override
            public void run() {
                int sum1 = 1;
                for (int i = 1; i <= 10; i++) {
                    sum1*=i;
                }
                System.out.println("10!="+sum1);
            }
        }.run();
        new Runnable() {
            @Override
            public void run() {
                int sum1 = 1;
                for (int i = 1; i <= 5; i++) {
                    sum1*=i;
                }
                System.out.println("5!="+sum1);
            }
        }.run();
        new Runnable() {
            @Override
            public void run() {
                int sum1 = 1;
                for (int i = 1; i <= 8; i++) {
                    sum1*=i;
                }
                System.out.println("8!="+sum1);
            }
        }.run();
    }
}
