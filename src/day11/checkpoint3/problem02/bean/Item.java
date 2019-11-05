package day11.checkpoint3.problem02.bean;

public class Item  {
    private Integer itemId;
    private Integer goodsCount;
    private Double amounts;
    private Goods goods;

    public Integer getItemId() {
        return itemId;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Double getAmounts() {
        return amounts;
    }

    public void setAmounts(Double amounts) {
        this.amounts = amounts;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return goods.getName()+"\t"+goods.getPrice()+"\t"+goodsCount+"\t"+amounts;
    }

}
