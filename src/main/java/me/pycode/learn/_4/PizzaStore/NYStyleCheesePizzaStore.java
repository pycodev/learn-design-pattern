package me.pycode.learn._4.PizzaStore;

public class NYStyleCheesePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        // 偷个懒
        return new NYStyleCheesePizza();
    }
}
