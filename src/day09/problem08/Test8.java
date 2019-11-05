package day09.problem08;

import day09.problem08.bean.Fruit;
import day09.problem08.bean.GouWuChe;
import day09.problem08.bean.Laptop;
import day09.problem08.bean.Phone;

public class Test8 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Laptop laptop = new Laptop("g10000","笔记本",10000.0);
        Phone phone = new Phone("g10001","手机",5000.0);
        Fruit apple = new Fruit("g20000","苹果",50.0);
        System.out.println("==========添加商品==========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(apple);
        System.out.println("==========打印商品==========");
        gouWuChe.showGoods();
        System.out.println("----------");
        gouWuChe.total();
    }
}
