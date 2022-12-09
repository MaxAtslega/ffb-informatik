package de.atslega.chapter03;

public class Kreditkarte {
    private final double verfuegungsrahmen = 2000;
    private int geheimzahl;
    private String typ;

    public Kreditkarte(int geheimzahl, String typ) {
        this.geheimzahl = geheimzahl;
        this.typ = typ;
    }

    public void geheimzahlAnzeigen() {
    }

    public void verfuegungsrahmenAnzeigen() {
    }

    public int getGeheimzahl() {
        return geheimzahl;
    }

    public void setGeheimzahl(int geheimzahl) {
        this.geheimzahl = geheimzahl;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getVerfuegungsrahmen() {
        return verfuegungsrahmen;
    }
}
