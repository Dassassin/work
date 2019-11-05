package day12.checkpoint2.problem01;

import day12.checkpoint2.problem01.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("明",15,80));
        list.add(new Student("红",13,46));
        list.add(new Student("亮",16,88));
        list.add(new Student("李",18,16));
        list.add(new Student("青",11,65));
        Iterator<Student> it = list.iterator();
        double sum = 0.00, max = 0.00, min = 0.00;
        while(it.hasNext()){
            Student student = it.next();
            System.out.println(student.toString());
            int s = student.getSorce();
            sum += s;
            if(s > max){
                max = s;
            }
            if (min == 0){
                min = s;
            }
            if (s < min) {
                min = s;
            }
        }
        double ave = sum/list.size();
        System.out.println("总分："+sum);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
    }
}
