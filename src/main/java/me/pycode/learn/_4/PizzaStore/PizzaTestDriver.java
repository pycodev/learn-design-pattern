package me.pycode.learn._4.PizzaStore;

public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nStore = new NYStyleCheesePizzaStore();
        Pizza pizza = nStore.orderPizza("");
    }
}
