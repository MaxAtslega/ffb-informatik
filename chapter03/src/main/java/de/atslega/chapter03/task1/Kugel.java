package de.atslega.chapter03.task1;

public class Kugel {
    double radius;

    public Kugel(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public void setRadius(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public void showOberFlaeche(){
        return;
    }

    public void showVolumen(){
        return;
    }
}