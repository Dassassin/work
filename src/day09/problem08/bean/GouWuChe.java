package day09.problem08.bean;

import java.util.ArrayList;

public class GouWuChe {
    public ArrayList<Goods> arrayList = new ArrayList<>();

    public void addGoods(Goods goods){
        arrayList.add(goods);
        System.out.println("加入 "+goods.getName()+" 成功");
    }

    public void showGoods(){
        System.out.println("您选购的商品为：");
        arrayList.forEach(System.out::println);
    }

    public void total(){
        double totalPrice = 0.0;
        double discountPrice = 0.0;
        for (Goods goods : arrayList){
            totalPrice += goods.getPrice();
        }
        System.out.println("原  价为："+totalPrice+" 元");
        for (Goods goods : arrayList){
            if (goods instanceof EGoods){
                discountPrice += goods.getPrice()*0.88;
            }else {
                discountPrice += goods.getPrice();
            }
        }
        System.out.println("折后价为："+discountPrice+" 元");
    }
}
