package me.pycode.learn._9.RestaurantMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu("MyMenu","PyCode's Menu");
        try {
            dinerMenu.add(new MenuItem("羊排", "非常好吃",5));
            dinerMenu.add(new MenuItem("猪排", "很好吃",3));
            dinerMenu.add(new MenuItem("鸡排", "好吃",3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
