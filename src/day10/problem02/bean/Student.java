package day10.problem02.bean;

public class Student {
    private String name;
    private boolean isAttendance;

    public Student() {

    }

    public Student(String name, boolean isAttendance) {
        this.name = name;
        this.isAttendance = isAttendance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAttendance() {
        return isAttendance;
    }

    public void setAttendance(boolean attendance) {
        isAttendance = attendance;
    }
}
