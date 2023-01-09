package de.atslega.rennschnecke;

public class Wette {
    private String schneckenName;
    private int wettEinsatz;
    private String spieler;

    private double gewinn = 0;

    public Wette(String schneckenName, int wettEinsatz, String spieler) {
        this.schneckenName = schneckenName;
        this.wettEinsatz = wettEinsatz;
        this.spieler = spieler;
    }

    public String getSchneckenName() {
        return schneckenName;
    }

    public double getGewinn() {
        return gewinn;
    }

    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }

    public void setSchneckenName(String schneckenName) {
        this.schneckenName = schneckenName;
    }

    public int getWettEinsatz() {
        return wettEinsatz;
    }

    public void setWettEinsatz(int wettEinsatz) {
        this.wettEinsatz = wettEinsatz;
    }

    public String getSpieler() {
        return spieler;
    }

    public void setSpieler(String spieler) {
        this.spieler = spieler;
    }

    public String toString(){
        return String.format("schneckenName: %s, WettEinsatz: %s, Spieler: %s, Gewinn: %s", schneckenName, wettEinsatz, spieler, gewinn);
    }
}
