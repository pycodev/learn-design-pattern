package me.pycode.learn._9.RestaurantMenu;

public class Waitress {
//    DinerMenu dinerMenu;
    MenuComponent allMenu;

    public Waitress(MenuComponent menu) {
        this.allMenu = menu;
    }

    public void printMenu() {
        allMenu.print();
    }
//    public void printMenu() {
//        Iterator iter = dinerMenu.createIterator();
//        printMenu(iter);
//    }

    private void printMenu(Iterator iter) {
        while (iter.hasNext()) {
            MenuItem next = (MenuItem) iter.next();
            next.show();
        }
    }
}
