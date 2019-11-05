package day13.checkpoint2.problem06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();
        while (set.size()<10){
            int i = r.nextInt(20)+1;
            set.add(i);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
