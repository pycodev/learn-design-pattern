package me.pycode.learn._3.Starbuzz;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", add Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
