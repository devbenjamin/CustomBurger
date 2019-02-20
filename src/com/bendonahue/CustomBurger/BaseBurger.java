//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bendonahue.CustomBurger;

public class BaseBurger extends com.bendonahue.CustomBurger.TotalBurgerPrice {
    private String name;
    private String meat = "beef";
    private String roll = "kaiser";
    private double burgerPrice = 5.0D;

    public BaseBurger() {
    }

    public BaseBurger(String meat, String roll, double burgerPrice, double toppingPrice) {
        this.name = this.name;
        this.meat = meat;
        this.roll = roll;
        this.burgerPrice = burgerPrice;
    }

    public BaseBurger(com.bendonahue.CustomBurger.Toppings top1, com.bendonahue.CustomBurger.Toppings top2, com.bendonahue.CustomBurger.Toppings top3, com.bendonahue.CustomBurger.Toppings top4) {
    }

    public String getName() {
        return this.name;
    }

    public String getMeat() {
        return this.meat;
    }

    public String getRoll() {
        return this.roll;
    }

    public double getBurgerPrice() {
        return this.burgerPrice;
    }
}

