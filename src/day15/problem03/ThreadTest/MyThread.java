package day15.problem03.ThreadTest;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(getName()+i+" ");
        }
        System.out.println();
    }
}
