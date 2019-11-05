package day13.checkpoint3.problem02;

import day13.checkpoint3.problem02.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        HashSet<HashSet> subject = new HashSet<>();
        HashSet<Student> class1 = new HashSet<>();
        HashSet<Student> class2 = new HashSet<>();
        HashSet<Student> class3 = new HashSet<>();
        class1.add(new Student("a",12));
        class1.add(new Student("b",13));
        class1.add(new Student("c",10));
        class2.add(new Student("q",12));
        class2.add(new Student("p",11));
        class3.add(new Student("w",14));
        class3.add(new Student("f",14));
        subject.add(class1);
        subject.add(class2);
        subject.add(class3);
        Iterator<HashSet> iterator = subject.iterator();
        while (iterator.hasNext()){
            Iterator<Student> it = iterator.next().iterator();
            while (it.hasNext()) {
                System.out.println(it.next().toString());
            }
        }
        for (HashSet<Student> Class:subject) {
            for (Student student:Class) {
                System.out.println(student.toString());
            }
        }
    }
}
