package day19.problem11;

import day19.problem11.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("a", 5, "男");
        Student s2 = new Student("b", 3, "女");
        Student s3 = new Student("c", 8, "男");
        Student s4 = new Student("d", 6, "男");
        Student s5 = new Student("e", 1, "女");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stu.txt"));
            out.writeObject(students);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
