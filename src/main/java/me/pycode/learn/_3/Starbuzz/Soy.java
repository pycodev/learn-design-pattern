package me.pycode.learn._3.Starbuzz;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", add Soy";
    }

    @Override
    public double cost() {
        return 0.05 + beverage.cost();
    }
}
