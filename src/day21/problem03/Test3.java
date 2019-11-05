package day21.problem03;

import day21.problem03.bean.Student;

import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("day21.problem03.bean.Student");
        Student s1 = (Student) c.newInstance();
        System.out.println(s1);
        Class<Student> clazz = Student.class;
        Constructor<Student> con = clazz.getConstructor();
        Student s2 = con.newInstance();
        System.out.println(s2);
    }
}
