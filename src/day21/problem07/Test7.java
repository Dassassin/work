package day21.problem07;

import day21.problem07.bean.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test7 {
    public static void main(String[] args) throws Exception {
        Class<Person> clazz = Person.class;
        Person p = clazz.newInstance();
        Method m = clazz.getMethod("setName", String.class);
        Object invoke = m.invoke(p,"a");
        Field f = clazz.getDeclaredField("age");
        f.setAccessible(true);
        f.set(p,5);
        System.out.println(p);
    }
}
