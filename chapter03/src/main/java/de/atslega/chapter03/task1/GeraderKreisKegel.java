package de.atslega.chapter03.task1;

public class GeraderKreisKegel {
    private double radius;
    private double hoehe;

    public GeraderKreisKegel(double radius, double hoehe) {
        this.radius = radius >= 0 ? radius : 0;
        this.hoehe = hoehe >= 0 ? hoehe : 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe >= 0 ? hoehe : 0;
    }

    public void setRadius(double radius) {
        this.radius = radius >= 0 ? radius : 0;
    }
    public void setHoehe(String hoehe) {
        double cHoehe = Double.parseDouble(hoehe);
        this.hoehe = cHoehe >= 0 ? cHoehe : 0;
    }

    public void setRadius(String radius) {
        double cRadius = Double.parseDouble(radius);
        this.radius = cRadius >= 0 ? cRadius : 0;
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
