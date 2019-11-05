package day15.problem02.ThreadTest;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("这是主线程");
        MyThread mt = new MyThread("a");
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.print("main"+i+" ");
        }
        System.out.println();
    }
}
