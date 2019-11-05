package day15.problem02.RunnableTest;

public class Test2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr,"a");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.print("main"+i+" ");
        }
        System.out.println();
    }
}
