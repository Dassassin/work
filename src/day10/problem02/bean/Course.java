package day10.problem02.bean;

public class Course {
    private String name;
    private Teacher teacher;
    private Student[] student;

    public Course() {

    }

    public Course(String name, Teacher teacher, Student[] student) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
    
    public void show(){
        System.out.println("课程名称："+name);
        System.out.println("授课老师："+teacher.getName());
        for (int i = 0; i < student.length; i++) {
            teacher.dianming(student[i].getName(),student[i].isAttendance());
        }
    }
}
