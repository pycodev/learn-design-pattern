package me.pycode.learn._1.SimUDark;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // 这里初始化实例变量地做法仍然不完全符合面向接口编程的设计原则
        super(new FlyWithWings(),new Quack());
    }

    protected void display() {
        System.out.println("I'm a real MallardDuck!");
    }
}
