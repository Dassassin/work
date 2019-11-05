package day11.checkpoint3.problem02.bean;

public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private String symbol;

    public Goods() {
    }

    public Goods(Integer id, String name, Double price, String symbol) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.symbol = symbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+price+"\t"+symbol;
    }

}
