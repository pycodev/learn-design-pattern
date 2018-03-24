package me.pycode.learn.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new Product1Builder());
        Product product = director.construct();
        product.run();
    }
}
