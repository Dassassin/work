package day16.problem08;

import day16.problem08.bean.Student;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("a",68),
                new Student("b",75),
                new Student("c",59),
                new Student("d",92),
        };
        Arrays.sort(students, Test8::compare);
        for (Student s:students) {
            System.out.println(s.toString());
        }
    }

    private static int compare(Student s1, Student s2) {
        return s2.getScore() - s1.getScore();
    }
}
