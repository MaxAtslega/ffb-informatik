package de.atslega.arztpraxis.personen;

public class Angestellter extends Person {
    protected double gehalt;

    public Angestellter(String name, String geschlecht, double gehalt) {
        super(name, geschlecht);
        this.gehalt = gehalt;
    }
}
