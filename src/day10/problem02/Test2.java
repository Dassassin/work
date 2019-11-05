package day10.problem02;

import day10.problem02.bean.Course;
import day10.problem02.bean.Student;
import day10.problem02.bean.Teacher;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("小红",true);
        Student s2 = new Student("小亮",true);
        Student s3 = new Student("小明",false);
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        Teacher teacher = new Teacher("张老师");
        Course course = new Course("Java",teacher, students);
        course.show();
    }
}
