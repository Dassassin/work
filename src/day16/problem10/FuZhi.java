package day16.problem10;

import day16.problem10.bean.Person;

public class FuZhi implements  Runnable{
    private Person person;

    public FuZhi(Person person){
        this.person = person;
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (person){
                if (person.getFlag()%2 == 0){
                    if (i % 2 == 0){
                        person.setName("aa");
                        person.setSex("男");
                    } else {
                        person.setName("bb");
                        person.setSex("女");
                    }
                    i++;
                    person.setFlag(person.getFlag() + 1);
                    System.out.println("赋值");
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
}
