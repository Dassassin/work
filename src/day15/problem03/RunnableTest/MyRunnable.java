package day15.problem03.RunnableTest;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(Thread.currentThread().getName()+i+" ");
        }
        System.out.println();
    }
}