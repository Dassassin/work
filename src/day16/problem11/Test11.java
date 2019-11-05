package day16.problem11;

public class Test11 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Thread t1 = new Thread(e, "前门");
        Thread t2 = new Thread(e, "后门");
        t1.start();
        t2.start();
    }
}
