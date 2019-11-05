package day11.checkpoint3.problem02.bean;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private List<Item> items =new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
