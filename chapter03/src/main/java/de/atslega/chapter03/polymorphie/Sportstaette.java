package de.atslega.chapter03.polymorphie;

public abstract class Sportstaette {
    public double gibGrundgebuehr;
    public double gibGesamtgebuehr;
    private double grundgebuehr;

    public Sportstaette(double grundgebuehr) {
        this.grundgebuehr = grundgebuehr;
    }
}
