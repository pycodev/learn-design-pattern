package me.pycode.learn._8.CaffeineBeverage;

public abstract class CaffeineBeverage {
    final public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
            addCondiments();
    }

    abstract public void brew();

    abstract public void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring intp cup");
    }

    // hook
    public boolean customerWantsCondiments(){
        return true;
    }

}
