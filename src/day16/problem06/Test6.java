package day16.problem06;

import day16.problem06.service.Director;

public class Test6 {
    public static void main(String[] args) {
        invokeDirect(() -> {
            System.out.println("导演拍电影啦!");
        });
        invokeDirect(() -> System.out.println("导演拍电影啦!"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
