package day10.problem02.bean;

public class Teacher {
    private String name;

    public Teacher() {

    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianming(String name,boolean b){
        if (b){
            System.out.println("上课："+name);
        }else {
            System.out.println("旷课："+name);
        }
    }
}
