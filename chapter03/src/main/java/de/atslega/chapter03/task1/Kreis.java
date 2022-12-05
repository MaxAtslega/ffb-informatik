package de.atslega.chapter03.task1;

public class Kreis {
    double radius;

    public Kreis(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public void setRadius(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }

    public void showFlaeche(){
        return;
    }

    public void showUmfang(){
        return;
    }
}
