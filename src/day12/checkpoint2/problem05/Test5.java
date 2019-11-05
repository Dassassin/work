package day12.checkpoint2.problem05;

import day12.checkpoint2.problem05.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<Person>();
        //List<Person> list2 = new ArrayList<Person>();
        list1.add(new Person("张三",26,1.80));
        list1.add(new Person("李四",24,1.60));
        list1.add(new Person("王五",23,1.65));
        list1.add(new Person("刘六",28,1.73));
        list1.add(new Person("赵七",25,1.69));
        Iterator<Person> it = list1.iterator();
        while(it.hasNext()){
            Person person = it.next();
            person.setAge(person.getAge()+2);
            //list2.add(person);
        }
        for (Person p:list1) {
            System.out.println("姓名："+p.getName()+"，年龄："+p.getAge()+"，身高："+p.getHeight());
        }
    }
}
