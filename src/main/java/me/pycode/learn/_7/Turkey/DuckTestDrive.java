package me.pycode.learn._7.Turkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck fakeDuck = new TurkeyAdapter(turkey);
        fakeDuck.quack();
        fakeDuck.fly();
    }
}
