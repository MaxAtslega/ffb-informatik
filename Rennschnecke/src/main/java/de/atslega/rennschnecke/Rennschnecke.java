package de.atslega.rennschnecke;

public class Rennschnecke {
    private String name;
    private String rasse;
    private double maxGeschwindigkeit;
    private double zurueckgelegterWeg;

    public Rennschnecke(String name, String rasse, double maxGeschwindigkeit, double zurueckgelegterWeg) {
        this.name = name;
        this.rasse = rasse;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.zurueckgelegterWeg = zurueckgelegterWeg;
    }

    public String getName() {
        return name;
    }

    public String getRasse() {
        return rasse;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public double getZurueckgelegterWeg() {
        return zurueckgelegterWeg;
    }

    public void krieche(){
        double straeke = Math.floor(Math.random() * maxGeschwindigkeit);
        zurueckgelegterWeg += straeke;
    }

    public String toString(){
        return String.format("Name: %s, Rasse: %s, Maximalgeschwindigkeit: %s, Weg: %s", name, rasse, maxGeschwindigkeit, zurueckgelegterWeg);
    }
}
