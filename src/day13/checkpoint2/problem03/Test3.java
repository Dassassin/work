package day13.checkpoint2.problem03;

import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String s:strs) {
            if(!list.contains(s)){
                list.add(s);
            }
        }
        for (String s:list) {
            System.out.print(s + " ");
        }
        System.out.println();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
