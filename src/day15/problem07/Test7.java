package day15.problem07;

public class Test7 {
    public static void main(String[] args) throws InterruptedException{
        GetOnBus gob = new GetOnBus();
        Thread t1 = new Thread(gob,"前门");
        Thread t2 = new Thread(gob,"中门");
        Thread t3 = new Thread(gob,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
