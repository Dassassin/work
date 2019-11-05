package day19.problem07;

import day19.problem07.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args) {
        Student s = new Student("a", 5, "男");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stu.txt"));
            out.writeObject(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
