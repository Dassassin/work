package day16.problem10;

import day16.problem10.bean.Person;

public class Test10 {
    public static void main(String[] args) {
        Person person = new Person();
        FuZhi fuZhi = new FuZhi(person);
        DaYin daYin = new DaYin(person);
        new Thread(fuZhi).start();
        new Thread(daYin).start();
    }
}
