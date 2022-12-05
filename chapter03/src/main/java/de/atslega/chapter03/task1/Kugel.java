package de.atslega.chapter03.task1;

public class Kugel {
    private double radius;

    public Kugel(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public void setRadius(String radius) {
        Double cRadius = Double.parseDouble(radius);
        this.radius = cRadius >= 0 ? cRadius : 0;
    }

    public void showOberFlaeche(){
        return;
    }

    public void showVolumen(){
        return;
    }
}