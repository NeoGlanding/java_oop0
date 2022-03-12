package com.ihsan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger neilBurgers = new Hamburger(3, 2);
        DeluxeHamburger joshBurger = new DeluxeHamburger(4, 8, 1, 3);

        System.out.println(neilBurgers.getPrice());
        System.out.println(joshBurger.getPrice());
    }
}
