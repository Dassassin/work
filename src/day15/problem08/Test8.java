package day15.problem08;

public class Test8 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread t1=new Thread(ticket,"a");
        Thread t2=new Thread(ticket,"b");
        Thread t3=new Thread(ticket,"c");
        Thread t4=new Thread(ticket,"c");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
