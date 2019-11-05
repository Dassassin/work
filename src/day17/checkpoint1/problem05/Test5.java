package day17.checkpoint1.problem05;

import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\a.txt");
        f1.delete();
        File f = new File("C:\\aaa");
        f.delete();
    }
}
