package me.pycode.learn.Builder;


public class Product {
    Component comp1;
    Component comp2;
    Component comp3;

    public Component getComp1() {
        return comp1;
    }

    public void setComp1(Component comp1) {
        this.comp1 = comp1;
    }

    public Component getComp2() {
        return comp2;
    }

    public void setComp2(Component comp2) {
        this.comp2 = comp2;
    }

    public Component getComp3() {
        return comp3;
    }

    public void setComp3(Component comp3) {
        this.comp3 = comp3;
    }

    public void run(){
        comp1.use();
        comp2.use();
        comp3.use();
    }
}
