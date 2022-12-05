package de.atslega.chapter03.task1;

public class GeraderKreisKegel {
    double radius;
    double hoehe;

    public GeraderKreisKegel(double radius, double hoehe) {
        this.radius = radius >= 0 ? radius : 0;
        this.hoehe = hoehe >= 0 ? hoehe : 0;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe >= 0 ? hoehe : 0;
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

    public void showMantel(){
        return;
    }
}
