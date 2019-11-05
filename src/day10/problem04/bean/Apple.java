package day10.problem04.bean;

public class Apple {
    private double sice;
    private String color;

    public Apple() {

    }

    public Apple(double sice, String color) {
        this.sice = sice;
        this.color = color;
    }

    public double getSice() {
        return sice;
    }

    public void setSice(double sice) {
        this.sice = sice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
