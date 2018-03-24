package me.pycode.learn.Builder;

public abstract class Component {

    String name;

    public Component(String name) {
        this.name = name;
    }

    abstract public void use();
}
