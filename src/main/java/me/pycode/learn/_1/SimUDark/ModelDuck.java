package me.pycode.learn._1.SimUDark;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    protected void display() {
        System.out.println("I'm a model duck.");
    }
}
