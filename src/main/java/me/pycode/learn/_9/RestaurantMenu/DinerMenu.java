package me.pycode.learn._9.RestaurantMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DinerMenu extends MenuComponent{
//    final static int MAX_ITEMS = 6;
//    int numOfItems = 0;
    List<MenuComponent> items;

    public DinerMenu(String name, String desc) {
        this.name = name;
        this.desc = desc;
//        items = new MenuItem[MAX_ITEMS];
        items = new ArrayList<MenuComponent>();
    }

    public Iterator createIterator() {
        return items.iterator();
    }

//    public void addItem(MenuItem item) throws Exception{
//        if (numOfItems < MAX_ITEMS) {
//            items[numOfItems++] = item;
//        } else {
//            throw new Exception("OutOfTheMaxNumber");
//        }
//    }

    @Override
    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
//        if (numOfItems < 1) {
//            return;
//        }
//        MenuComponent[] b = new MenuComponent[MAX_ITEMS];
//        int i = 0;
//        for (; i < numOfItems; i++) {
//            if (items[i] == component) {
//                break;
//            }
//        }
//        for (; i < numOfItems-1; i++) {
//            items[i] = items[i + 1];
//        }
//        numOfItems--;

        items.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
//        return i >= numOfItems ? items[i] : null;
        return items.get(i);
    }

    @Override
    public void print() {
//        for (MenuComponent c : items) {
//            c.print();
//        }
        System.out.println(getName());
        System.out.println(getDescribe());
        System.out.println("------------------------------");

        Iterator iter = createIterator();
        while (iter.hasNext()) {
            MenuComponent o = (MenuComponent) iter.next();
            o.print();
        }
    }

}
