package me.pycode.learn.Builder;

public class Product1Builder extends Builder{
    public Product1Builder() {
        super(new Product(){});
    }

    public void buildComp1() {
        product.setComp1(new Component("Component1"){

            @Override
            public void use() {
                System.out.println(name);
            }
        });
    }

    public void buildComp2() {
        product.setComp2(new Component("Component2"){
            @Override
            public void use() {
                System.out.println(name);
            }
        });
    }

    public void buildComp3() {
        product.setComp3(new Component("Component2"){
            @Override
            public void use() {
                System.out.println(name);
            }
        });
    }
}
