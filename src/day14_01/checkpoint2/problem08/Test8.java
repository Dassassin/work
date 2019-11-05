package day14_01.checkpoint2.problem08;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        HashMap<String,Integer> map = new HashMap<>();
        while (map.size()<5){
            System.out.print("请输入一个姓名：");
            String name = sc.nextLine();
            int score = r.nextInt(100)+1;
            map.put(name,score);
        }
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        int i = 0;
        if (it.hasNext()){
            i = map.get(it.next());
        }
        int sum = 0;
        int max = i;
        int min = i;
        for (String key:keys) {
            sum += map.get(key);
            if(max<map.get(key)){
                max = map.get(key);
            }
            if (min>map.get(key)){
                min = map.get(key);
            }
        }
        int avg = sum/map.size();
        System.out.println("总分="+sum+"，最高分="+max+"，最低分="+min+"，平均分="+avg);
    }
}
