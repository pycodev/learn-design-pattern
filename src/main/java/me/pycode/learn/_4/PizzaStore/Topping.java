package me.pycode.learn._4.PizzaStore;

public class Topping {
    String name;

    public Topping(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "topping "+ name;
    }
}
