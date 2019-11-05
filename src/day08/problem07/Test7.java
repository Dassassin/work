package day08.problem07;

import day08.problem04.C;

public class Test7 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setNum("m110");
        manager.setName("老王");
        manager.setSalary(10000.0);
        manager.eat();
        manager.work();
        Cooker cooker = new Cooker();
        cooker.setNum("c110");
        cooker.setName("小王");
        cooker.setSalary(6000.0);
        cooker.eat();
        cooker.work();
    }
}
