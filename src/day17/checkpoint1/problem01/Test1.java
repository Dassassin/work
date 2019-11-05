package day17.checkpoint1.problem01;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\admin\\Desktop\\work\\src\\day17\\checkpoint1\\problem01\\juedui.txt");
        f1.createNewFile();
        File f2 = new File("xiangdui.txt");
        f2.createNewFile();
    }
}
