package me.pycode.learn._4.PizzaStore;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Pium Tomato Sauce";

        toppings.add(new Topping("Shredded Mozzarella Cheese"));
    }

    @Override
    public Pizza cut() {
        System.out.println("Cutting the pizza into square slices");
        return this;
    }
}
