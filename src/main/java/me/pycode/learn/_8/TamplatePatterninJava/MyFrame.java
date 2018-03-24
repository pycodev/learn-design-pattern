package me.pycode.learn._8.TamplatePatterninJava;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!";
//        g.setColor(new Color(0,0,0));
        g.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        new MyFrame("Hello");
    }
}
