package com.ihsan;

public class DeluxeHamburger extends Hamburger {
    private int cheese;
    private int tomato;
    private int price;

    public DeluxeHamburger(int meat, int salad, int cheese, int tomato) {
        super(meat, salad);
        this.cheese = cheese;
        this.tomato = tomato;
        this.price = super.getPrice() + ((int) cheese * 2) + ((int) tomato * 2);
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
