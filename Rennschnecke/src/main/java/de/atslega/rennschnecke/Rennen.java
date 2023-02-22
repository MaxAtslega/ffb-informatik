package de.atslega.rennschnecke;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Rennen {
    private String name;
    private int anzahlDerTeilnehmendenSchnecken;
    private ArrayList<Rennschnecke> teilnehmendenSchnecken;
    private double laengeDerZuKriechendenStrecke;

    public Rennen(String name, ArrayList<Rennschnecke> teilnehmendenSchnecken, double laengeDerZuKriechendenStrecke) {
        this.name = name;
        this.teilnehmendenSchnecken = teilnehmendenSchnecken;
        this.laengeDerZuKriechendenStrecke = laengeDerZuKriechendenStrecke;
        this.anzahlDerTeilnehmendenSchnecken = teilnehmendenSchnecken.size();
    }


    public String getName() {
        return name;
    }

    public int getAnzahlDerTeilnehmendenSchnecken() {
        return anzahlDerTeilnehmendenSchnecken;
    }

    public ArrayList<Rennschnecke> getTeilnehmendenSchnecken() {
        return teilnehmendenSchnecken;
    }

    public double getLaengeDerZuKriechendenStrecke() {
        return laengeDerZuKriechendenStrecke;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaengeDerZuKriechendenStrecke(double laengeDerZuKriechendenStrecke) {
        this.laengeDerZuKriechendenStrecke = laengeDerZuKriechendenStrecke;
    }

    public void addRennschnecke(Rennschnecke rennschnecke){
        teilnehmendenSchnecken.add(rennschnecke);
        anzahlDerTeilnehmendenSchnecken++;
    }

    public void removeRennschnecke(Rennschnecke rennschnecke){
        if (teilnehmendenSchnecken.contains(rennschnecke)){
            teilnehmendenSchnecken.remove(rennschnecke);
            anzahlDerTeilnehmendenSchnecken--;
        }
    }

    public String toString(){
        return String.format("Name: %s, AnzahlDerTeilnehmendenSchnecken: %s, Teilnehmenden Schnecken: [(%s)]", name, anzahlDerTeilnehmendenSchnecken, teilnehmendenSchnecken.stream().map(Rennschnecke::toString).collect(Collectors.joining(")\n (")));
    }

}
