package day19.problem08;

import day19.problem07.bean.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args) {
        Student s = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("stu.txt"));
            s = (Student)in.readObject();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Name:"+s.getName());
        System.out.println("age:"+s.getAge());
        System.out.println("Sex"+s.getSex());
    }
}
