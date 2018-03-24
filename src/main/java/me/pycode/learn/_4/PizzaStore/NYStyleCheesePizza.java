package me.pycode.learn._4.PizzaStore;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add(new Topping("Grated Reggiano Cheese"));
    }
}
