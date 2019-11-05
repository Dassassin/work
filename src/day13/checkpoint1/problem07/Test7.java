package day13.checkpoint1.problem07;

import day13.checkpoint1.problem07.bean.Person;

import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {
        HashSet<Person> perSet = new HashSet<Person>();
        perSet.add(new Person("aa",1));
        perSet.add(new Person("vv",3));
        perSet.add(new Person("ww",1));
        perSet.add(new Person("dd",5));
        for (Person person : perSet) {
            System.out.println(person);
        }
    }
}
