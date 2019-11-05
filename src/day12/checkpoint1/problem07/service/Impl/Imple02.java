package day12.checkpoint1.problem07.service.Impl;

import day12.checkpoint1.problem07.service.Inter;

public class Imple02<E> implements Inter<E>{
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
