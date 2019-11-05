package day11.checkpoint3.problem02;

import day11.checkpoint3.problem02.bean.Goods;
import day11.checkpoint3.problem02.bean.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        List<Goods> goodsList = createGoods();
        List<Item> items =new ArrayList<>();
        List<Item> itemList = items;
        System.out.println("\t\t 欢迎使用超市购物系统\t");
        while(true) {
            System.out.println("请输入您要进行的操作:");
            System.out.println("1:购买商品\t\t2:结算并打印小票\t3：退出系统");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("--------------------");
                    showGoods();
                    itemList = selectGoods(goodsList,items);
                    break;
                case 2:
                    System.out.println("--------------------");
                    showItems(itemList);
                    break;
                case 3:
                    System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜");
                    System.exit(0);
                default:
                    System.out.println("请输入正确的数字!");
                    break;
            }
        }
    }

    private static List<Goods> createGoods() {
        List<Goods> list = new ArrayList<>();
        list.add(new Goods(001, "少林核桃", 15.5, "斤"));
        list.add(new Goods(002, "尚康饼干", 14.5, "包"));
        list.add(new Goods(003, "移动硬盘", 345.0, "个"));
        list.add(new Goods(004, "高清无码", 199.0, "G"));
        return list;
    }

    private static List<Goods> showGoods() {
        System.out.println("\t\t\t\t商品列表");
        System.out.println("商品id" + "\t名称" + "\t单价" + "\t计算单位");
        List<Goods> list = createGoods();
        for (int i = 0;i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        return list;
    }

    private static List<Item> selectGoods(List<Goods> goodsList, List<Item> items) {
        System.out.println("请输入您要购买的商品项(输入格式:商品id-购买数量),输入end表示购买结束");
        while (true){
            String s = new Scanner(System.in).nextLine();
            String regex= "[0-9]+-[0-9]+";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(s);
            if ("end".equals(s)){
                System.out.println("购买结束");
                return items;
            } else if (!m.matches()){
                System.out.println("您的输入姿势不对,请换个姿势再来一次(输入格式:商品id-购买数量)");
            } else {
                String[] splits = s.split("-");
                Integer id = Integer.valueOf(splits[0]);
                Goods goods = getGoods(goodsList, id);

                if (goods==null){
                    System.out.println("您输入的商品id不存在，请重新输入！！");
                    continue;
                }
                Integer goodsCount = Integer.valueOf(splits[1]);
                Integer itemIndex = checkItem(items,id);

                if (itemIndex==null){
                    Item item=new Item();
                    item.setGoods(goods);
                    item.setGoodsCount(goodsCount);
                    item.setAmounts(goods.getPrice()*goodsCount);
                    items.add(item);
                }else {
                    Item item = items.get(itemIndex);
                    Double oldAmounts = item.getAmounts();
                    Integer oldGoodsCount = item.getGoodsCount();
                    items.get(itemIndex).setGoodsCount(oldGoodsCount+goodsCount);
                    items.get(itemIndex).setAmounts(goods.getPrice()*goodsCount+oldAmounts);
                }
            }
        }
    }

    private static Goods getGoods(List<Goods> list,Integer id){
        for (Goods goods : list) {
            if (id.equals(goods.getId())){
                return goods;
            }
        }
        return null;
    }

    private static Integer checkItem(List<Item> items, Integer id) {
        Item item=new Item();
        for (int i = 0; i < items.size(); i++) {
            item=items.get(i);
            if (id.equals(item.getGoods().getId())){
                return i;
            }
        }
        return null;
    }

    private static void showItems(List<Item> itemList) {
        System.out.println("\t欢迎光临\t\t");
        System.out.println("名称    " + "\t售价    " + "\t数量    " + "\t金额");
        System.out.println("--------------------");
        for (int i = 0; i<itemList.size();i++){
            System.out.println(itemList.get(i).toString());
        }
        System.out.println("--------------------");
        printTicket(itemList);
    }

    private static void printTicket(List<Item> itemList) {
        System.out.println(itemList.size()+"项商品");
        Integer count =0;
        Double sum=0.0;
        for (Item item : itemList) {
            count +=item.getGoodsCount();
            sum+=item.getAmounts();
        }
        System.out.println("共计:"+count+"件");
        System.out.println("共计:"+sum+"元");
        System.out.println("--------------------");
    }
}
