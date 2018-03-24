package me.pycode.learn.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    String type;

    public ConcreteFlyweight(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void use() {

    }

    public static void main(String[] args) {
        String s1 = "pycode";
        String s2 = "pycode";
        String s3 = "pyc"+"ode";
        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }
}
