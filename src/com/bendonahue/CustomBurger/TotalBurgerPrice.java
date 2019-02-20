//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bendonahue.CustomBurger;

public class TotalBurgerPrice {
    private double toppingPrice = 0.5D;

    public TotalBurgerPrice() {
    }

    public double totalPriceCalculator(double burgerPrice, double toppingPrice) {
        return burgerPrice + toppingPrice;
    }

    public double toppingsCounter(com.bendonahue.CustomBurger.Toppings top1, com.bendonahue.CustomBurger.Toppings top2, com.bendonahue.CustomBurger.Toppings top3, com.bendonahue.CustomBurger.Toppings top4) {
        double totalToppingPrice = 0.0D;
        if (top1 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (top2 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (top3 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (top4 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        return totalToppingPrice;
    }

    public double toppingsCounter(com.bendonahue.CustomBurger.Toppings top1, com.bendonahue.CustomBurger.Toppings top2, com.bendonahue.CustomBurger.Toppings top3, com.bendonahue.CustomBurger.Toppings top4, com.bendonahue.CustomBurger.Toppings vTop1, com.bendonahue.CustomBurger.Toppings vTop2) {
        double totalToppingPrice = 0.0D;
        if (top1 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (top2 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (top3 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (top4 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (vTop1 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        if (vTop2 != null) {
            totalToppingPrice += this.getToppingPrice();
        }

        return totalToppingPrice;
    }

    public double getToppingPrice() {
        return this.toppingPrice;
    }
}