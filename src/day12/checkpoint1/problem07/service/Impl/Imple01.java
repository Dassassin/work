package day12.checkpoint1.problem07.service.Impl;

import day12.checkpoint1.problem07.service.Inter;

public class Imple01 implements Inter<String>{

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
