package day08.problem05;

public class Test5 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平",30,"Java");
        teacher.teach();
        Student student =new Student("李小乐",20,90);
        student.test();
    }
}
