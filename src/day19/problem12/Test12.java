package day19.problem12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        Path path1 = Paths.get("a.txt");
        Path path2 = Paths.get("b.txt");
        try {
            Files.copy(path1,path2, StandardCopyOption.REPLACE_EXISTING);
            List<String> list = Files.readAllLines(path2);
            for (String s:list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
