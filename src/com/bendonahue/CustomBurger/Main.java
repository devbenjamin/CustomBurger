//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bendonahue.CustomBurger;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        com.bendonahue.CustomBurger.Toppings top1 = new com.bendonahue.CustomBurger.Toppings("onion");
        com.bendonahue.CustomBurger.Toppings top2 = new com.bendonahue.CustomBurger.Toppings("none");
        com.bendonahue.CustomBurger.Toppings top3 = new com.bendonahue.CustomBurger.Toppings("cheese");
        com.bendonahue.CustomBurger.Toppings top4 = new com.bendonahue.CustomBurger.Toppings("none");
        com.bendonahue.CustomBurger.Toppings vTop1 = new com.bendonahue.CustomBurger.Toppings("alfalfa");
        com.bendonahue.CustomBurger.Toppings vTop2 = new com.bendonahue.CustomBurger.Toppings("hummice");
        com.bendonahue.CustomBurger.BaseBurger baseBurger = new com.bendonahue.CustomBurger.BaseBurger(top1, top2, top3, top4);
        com.bendonahue.CustomBurger.VegBurger vegBurger = new com.bendonahue.CustomBurger.VegBurger(top1, top2, top3, top4, vTop1, vTop2);
        System.out.println("The price of your beef burger is only $" + baseBurger.totalPriceCalculator(baseBurger.getBurgerPrice(), baseBurger.toppingsCounter(top1, top2, top3, top4)));
        System.out.println("The Price for your healthy burger is $" + vegBurger.totalPriceCalculator(vegBurger.getBurgerPrice(), vegBurger.toppingsCounter(top1, top2, top3, top4, vTop1, vTop2)));
        System.out.println(vegBurger.getMeat());
    }
}