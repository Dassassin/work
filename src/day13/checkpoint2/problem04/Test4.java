package day13.checkpoint2.problem04;

import day13.checkpoint2.problem04.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("aa",15,"男"));
        students.add(new Student("vv",12,"女"));
        students.add(new Student("ss",14,"男"));
        students.add(new Student("dd",15,"男"));
        students.add(new Student("aa",15,"男"));
        students.add(new Student("cc",16,"女"));
        students.add(new Student("ww",13,"男"));
        students.add(new Student("qq",12,"女"));
        students.add(new Student("rr",12,"女"));
        students.add(new Student("ff",11,"男"));
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        for (Student student:students){
            System.out.println(student.toString());
        }
    }
}
