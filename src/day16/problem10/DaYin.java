package day16.problem10;

import day16.problem10.bean.Person;

public class DaYin implements Runnable{
    private Person person;

    public DaYin(Person person){
        this.person = person;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (person){
                if (person.getFlag() % 2 == 1){
                    person.setFlag(person.getFlag()+1);
                    System.out.println("打印："+person.toString());
                }
                try {
                    person.notify();
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
