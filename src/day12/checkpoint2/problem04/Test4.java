package day12.checkpoint2.problem04;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        String[] strings = {"a"," ","","1513","..."};
        swap(strings,2,4);
        Integer[] ints = {1,2,3,4,5};
        swap(ints,1,3);
    }

    public static <E> void swap(E[] es, int i1, int i2){
        System.out.println("原数组为："+ Arrays.toString(es));
        if(i1 > es.length-1 || i2 > es.length-1){
            System.out.println("索引超出数组长度");
        }else if(i1 < 0 || i2 < 0){
            System.out.println("索引出错");
        }else {
            E temp = es[i1];
            es[i1] = es[i2];
            es[i2] = temp;
        }
        System.out.println("交换元素后的数组为："+Arrays.toString(es));
    }
}
