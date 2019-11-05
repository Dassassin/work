package day13.checkpoint1.problem10;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = add("a","b","c","d");
        for (String s:arrayList) {
            System.out.print(s);
        }
    }

    private static ArrayList<String> add(String... str) {
        ArrayList<String> list = new ArrayList<>();
        for (String s: str){
            list.add(s);
        }
        return list;
    }


}
