package day12.checkpoint2.problem02;

import day12.checkpoint2.problem02.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",26,1.80));
        list.add(new Person("李四",24,1.60));
        list.add(new Person("王五",23,1.65));
        list.add(new Person("刘六",28,1.73));
        list.add(new Person("赵七",25,1.69));
        Iterator<Person> it = list.iterator();
        Person tallestPerson = new Person("",0,0.00);
        Person shortestPerson = new Person("",0,0.00);
        while(it.hasNext()){
            Person person = it.next();
            if(person.getHeight() > tallestPerson.getHeight()){
                tallestPerson = person;
            }
            if (shortestPerson.getHeight() == 0.00){
                shortestPerson = person;
            }
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person;
            }
        }
        System.out.println("最高的人是"+tallestPerson.getName()+"，身高"+tallestPerson.getHeight()+"。最矮的人是"+shortestPerson.getName()+"，身高"+shortestPerson.getHeight());
    }
}
