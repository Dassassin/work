package day17.checkpoint3.problem03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String s = sc.nextLine();
        File f = new File(s);
        printDir(f,map);
        Set<String> set = map.keySet();
        for(String str :set){
            System.out.println(str+"类型有"+map.get(str)+"个");
        }
        System.out.println("--------------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e:entries) {
            String key = e.getKey();
            int value = e.getValue();
            System.out.println(key+"类型有"+value+"个");
        }
    }


    private static HashMap<String, Integer> printDir(File f,HashMap<String, Integer> map) {
        File[] files = f.listFiles();
        Set<String> set = map.keySet();
        for(File file : files){
            if(file.isDirectory()){
                printDir(file,map);
            }else{
                //System.out.println(file);
                String key = file.getName().substring(file.getName().lastIndexOf(".")+1);
                if(set.contains(key)){
                    map.put(key, map.get(key)+1);
                }else{
                    map.put(key, 1);
                }
            }
        }
        return map;
    }
}
