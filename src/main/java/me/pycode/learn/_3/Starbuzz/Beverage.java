package me.pycode.learn._3.Starbuzz;

public abstract class Beverage {
    String description="unknown beverage";

    public String getDescription() {
        return description;
    }
    abstract public double cost();
}
