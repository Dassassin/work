package day08.problem05;

public class Student extends Person{
    private int point;

    public Student() {

    }

    public Student(String name, int age, int point) {
        super(name, age);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void test(){
        System.out.println(getName()+ "通信，考试得了：" + getPoint()+ "分");
    }
}
