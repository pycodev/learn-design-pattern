package me.pycode.learn._3.Starbuzz;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", add Whip";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
