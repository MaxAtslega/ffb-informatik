package de.atslega.chapter03.task1;

public class Wuerfel {
    private double seiteA;

    public Wuerfel(double seiteA) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
    }

    public double getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
    }

    public void setSeiteA(String seiteA) {
        double cSeiteA = Double.parseDouble(seiteA);
        this.seiteA = cSeiteA >= 0 ? cSeiteA : 0;
    }

    public void showOberFlaeche() {
        return;
    }

    public void showVolumen() {
        return;
    }
}
