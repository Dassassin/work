package day13.checkpoint2.problem05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        set.addAll(Arrays.asList(arr));
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        for (String s:list) {
            System.out.print(s+" ");
        }
    }
}
