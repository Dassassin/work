package exam02.problem02;

import exam02.problem02.bean.Fruit;
import exam02.problem02.bean.Notebook;
import exam02.problem02.bean.Phone;
import exam02.problem02.bean.ShoppingCart;

public class Test2 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Notebook notebook = new Notebook("g10000", "笔记本", 10000.0);
        Phone phone = new Phone("g10001", "手机", 5000.0);
        Fruit apple = new Fruit("g20000", "苹果", 50.0);
        System.out.println("==========添加商品==========");
        shoppingCart.addGoods(notebook);
        shoppingCart.addGoods(phone);
        shoppingCart.addGoods(apple);
        System.out.println("==========打印商品==========");
        shoppingCart.showGoods();
        System.out.println("----------");
        shoppingCart.total();
    }
}
