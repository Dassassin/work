package day10.problem04.service;

import day10.problem04.bean.Apple;

public interface CompareAble {
    default Apple compare(Apple a1, Apple a2){
        return a1.getSice()-a2.getSice()>0?a1:a2;
    }
}
