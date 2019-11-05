package exam02.problem04;

public class Test4 {
    public static void main(String[] args) {
        GetOnBus gob = new GetOnBus();
        Thread t1 = new Thread(gob, "前门");
        Thread t2 = new Thread(gob, "中门");
        Thread t3 = new Thread(gob, "后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
