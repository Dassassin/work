package day08.problem08;

public class Lecturer extends Employee {
    public Lecturer() {

    }

    public Lecturer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 " +getId()+" 的讲师 "+getName()+" 在讲课");
    }
}
