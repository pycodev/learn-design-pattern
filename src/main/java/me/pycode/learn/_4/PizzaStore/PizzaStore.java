package me.pycode.learn._4.PizzaStore;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare()
                .bake()
                .cut()
                .box();
        return pizza;
    }
}
