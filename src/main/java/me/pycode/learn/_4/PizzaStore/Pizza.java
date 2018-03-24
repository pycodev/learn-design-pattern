package me.pycode.learn._4.PizzaStore;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<Topping> toppings = new ArrayList();

    protected boolean prepared = false;
    protected boolean baked = false;
    protected boolean cutted = false;
    protected boolean boxed = false;

    public Pizza prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Tossing sauce...");
        System.out.println("Tossing topping: ");
        for (Topping topping : toppings) {
            System.out.println("   " + topping);
        }
        return this;
    }
    public  Pizza bake(){
        System.out.println("Bake for 25 minutes at 350");
        return this;
    }
    public  Pizza cut(){
        System.out.println("Cutting the pizza into diagonal slices");
        return this;

    }
    public  Pizza box(){
        System.out.println("Place pizza in official pizzastore box");
        return this;
    }
}
