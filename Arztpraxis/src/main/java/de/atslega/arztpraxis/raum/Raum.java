package de.atslega.arztpraxis.raum;

public abstract class Raum {
    protected int anzahlTueren;
    protected int anzahlFenster;
    protected double flaeche;

    public Raum(int anzahlTueren, int anzahlFenster, double flaeche) {
        this.anzahlTueren = anzahlTueren;
        this.anzahlFenster = anzahlFenster;
        this.flaeche = flaeche;
    }
}
