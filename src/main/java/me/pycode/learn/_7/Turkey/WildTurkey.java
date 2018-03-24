package me.pycode.learn._7.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }
}
