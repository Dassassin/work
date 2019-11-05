package day19.problem10;

import java.io.*;
import java.util.*;

import static java.util.Collections.reverse;

public class Test10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));
            List<String> list = new ArrayList<>();
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            reverse(list);
            for (String s:list) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
