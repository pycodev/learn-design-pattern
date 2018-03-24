package me.pycode.learn.Builder;


/**
 * 隔离客户与生产过程
 * 负责控制产品的生成过程
 */
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildComp1();
        builder.buildComp2();
        builder.buildComp3();
        return builder.getProduct();
    }
}
