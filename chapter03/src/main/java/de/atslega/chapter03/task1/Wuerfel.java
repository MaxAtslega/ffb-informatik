package de.atslega.chapter03.task1;

public class Wuerfel {
    double seiteA;

    public Wuerfel(double seiteA) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
    }

    public void showOberFlaeche(){
        return;
    }

    public void showVolumen(){
        return;
    }
}
