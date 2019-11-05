package day12.checkpoint1.problem07;

import day12.checkpoint1.problem07.service.Impl.Imple01;
import day12.checkpoint1.problem07.service.Impl.Imple02;

public class Test07 {
    public static void main(String[] args) {
        Imple01 imple01 = new Imple01();
        imple01.show("cao");
        Imple02<Integer> imple02 = new Imple02<Integer>();
        imple02.show(86416546);

    }
}
