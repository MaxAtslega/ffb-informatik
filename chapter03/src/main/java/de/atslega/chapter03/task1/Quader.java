package de.atslega.chapter03.task1;

public class Quader {
    double seiteA;
    double seiteB;
    double seiteC;

    public Quader(double seiteA, double seiteB, double seiteC) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
        this.seiteB = seiteB >= 0 ? seiteB : 0;
        this.seiteC = seiteC >= 0 ? seiteC : 0;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA >= 0 ? seiteA : 0;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB >= 0 ? seiteB : 0;
    }

    public void setSeiteC(double seiteC) { this.seiteC = seiteC >= 0 ? seiteC : 0; }
}
