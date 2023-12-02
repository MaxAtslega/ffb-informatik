package de.atslega.chapter03.task1;

import java.awt.*;

public class Kreis extends Form {
    private int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius >= 0 ? radius : 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public void showFlaeche() {
        return;
    }

    public void showUmfang() {
        return;
    }

    public Graphics2D draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(getX(), getY(), (radius + radius), (radius + radius));

        return g2d;
    }
}
