package de.atslega.chapter03.task1;

public class Quader {
    private double seiteA;
    private double seiteB;
    private double seiteC;

    public Quader(double seiteA, double seiteB, double seiteC) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
        this.seiteB = seiteB >= 0 ? seiteB : 0;
        this.seiteC = seiteC >= 0 ? seiteC : 0;
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

    public double getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB >= 0 ? seiteB : 0;
    }

    public void setSeiteB(String seiteB) {
        double cSeiteB = Double.parseDouble(seiteB);
        this.seiteB = cSeiteB >= 0 ? cSeiteB : 0;
    }

    public double getSeiteC() {
        return seiteC;
    }

    public void setSeiteC(double seiteC) {
        this.seiteC = seiteC >= 0 ? seiteC : 0;
    }

    public void setSeiteC(String seiteC) {
        double cSeiteC = Double.parseDouble(seiteC);
        this.seiteC = cSeiteC >= 0 ? cSeiteC : 0;
    }
}
