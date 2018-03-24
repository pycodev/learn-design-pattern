package me.pycode.learn.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    HashMap<Integer, Flyweight> hashMap;

    Flyweight getFlyweight(int key){
        Flyweight flyweight = hashMap.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight("new");
        }
        return flyweight;
    }
}
