package day18.checkpoint2.problem03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\admin\\Desktop\\work\\test.txt");
        HashMap<Character, Integer> map = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream(f);
            int b;
            while ((b = fis.read()) != -1) {
                statistics((char)b, map);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<Character> set = map.keySet();
        for(char c :set){
            System.out.println(c+"出现"+map.get(c)+"次");
        }
    }

    private static HashMap<Character, Integer> statistics(char b, HashMap<Character, Integer> map) {
        Set<Character> set = map.keySet();
        if(set.contains(b)){
            map.put(b, map.get(b)+1);
        }else{
            map.put(b, 1);
        }
        return map;
    }
}
