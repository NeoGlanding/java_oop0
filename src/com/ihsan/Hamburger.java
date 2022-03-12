package com.ihsan;

public class Hamburger {
    private int meat;
    private int salad;
    private int price;

    public Hamburger(int meat, int salad) {
        this.meat = meat;
        this.salad = salad;
        this.price =  ((int) (meat * 3)) + ((int) (salad * 1.5));
    }

    public int getPrice() {
        return this.price;
    }
}
