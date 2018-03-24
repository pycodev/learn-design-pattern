package me.pycode.learn._1.SimUDark;

/**
 * test class
 */
public class miniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
