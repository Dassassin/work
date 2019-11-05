package day13.checkpoint2.problem10;

import day13.checkpoint2.problem10.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("a",18,95));
        set.add(new Student("b",15,68));
        set.add(new Student("c",16,73));
        set.add(new Student("d",17,84));
        set.add(new Student("e",18,78));
        Iterator<Student> it = set.iterator();
        int sum = 0;
        int max = it.next().getScore();
        int min = it.next().getScore();
        for (Student s:set) {
            sum += s.getScore();
            if (s.getScore() > max){
                max = s.getScore();
            }
            if (s.getScore() < min){
                min = s.getScore();
            }
            System.out.println(s.toString());
        }
        int avg = sum/set.size();
        System.out.println("总分："+sum);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均分："+avg);
    }
}
