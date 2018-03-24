package me.pycode.learn.Builder;

public abstract class Builder {

    Product product;

    public Builder(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    abstract public void buildComp1();
    abstract public void buildComp2();
    abstract public void buildComp3();
}
