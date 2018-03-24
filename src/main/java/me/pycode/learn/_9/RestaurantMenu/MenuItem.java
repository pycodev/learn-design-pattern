package me.pycode.learn._9.RestaurantMenu;

public class MenuItem extends MenuComponent{

    String name;
    String desc;
    double price;

    public MenuItem(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public void show() {
        print();
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
