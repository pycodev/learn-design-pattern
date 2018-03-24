package me.pycode.learn._8.TamplatePatterninJava;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    private String msg;

    @Override
    public void init() {
        super.init();
        msg = "Hello! I'm alive.";
        repaint();
    }

    @Override
    public void start() {
        super.start();
        msg = "Now,I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        super.stop();
        msg = "Now,I begin stopping...";
        repaint();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg,5,15);
    }
}
