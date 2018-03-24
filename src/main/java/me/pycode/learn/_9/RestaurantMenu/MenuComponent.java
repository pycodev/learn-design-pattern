package me.pycode.learn._9.RestaurantMenu;

public abstract class MenuComponent {
    String name;
    String desc;
    public String getName(){
        return name;
    }
    public String getDescribe(){
        return desc;
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    abstract public void print();

    public void add(MenuComponent component) throws Exception {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();

    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
}
