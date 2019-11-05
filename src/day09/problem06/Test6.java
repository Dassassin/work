package day09.problem06;

import day09.problem06.bean.SportStudent;
import day09.problem06.bean.SportTeacher;
import day09.problem06.bean.Student;
import day09.problem06.bean.Teacher;
import day09.problem06.service.Sport;

public class Test6 {
    static void goToSport(Sport sport){
        if (sport instanceof SportTeacher){
            sport.playBasketball();
        }else if (sport instanceof SportStudent){
            sport.playBasketball();
        }
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("马云");
        t1.setAge(45);
        SportTeacher t2 = new SportTeacher();
        t2.setName("大姚");
        t2.setAge(35);
        Student s1 = new Student();
        s1.setName("小王");
        s1.setAge(20);
        SportStudent s2 = new SportStudent();
        s2.setName("王中王");
        s2.setAge(21);
        //goToSport(t1);
        goToSport(t2);
        //goToSport(s1);
        goToSport(s2);
    }
}
