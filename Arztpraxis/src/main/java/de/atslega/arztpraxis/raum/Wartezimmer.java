package de.atslega.arztpraxis.raum;

import de.atslega.arztpraxis.personen.Patient;

import java.util.ArrayList;

public class Wartezimmer extends Raum{
    private int anzahlPlaetze;
    private ArrayList<Patient> patientenImZimmer;

    public Wartezimmer(int anzahlTueren, int anzahlFenster, double flaeche, int anzahlPlaetze, ArrayList<Patient> patientenImZimmer) {
        super(anzahlTueren, anzahlFenster, flaeche);
        this.anzahlPlaetze = anzahlPlaetze;
        this.patientenImZimmer = patientenImZimmer;
    }

    public ArrayList<Patient> getPatientenImZimmer() {
        return patientenImZimmer;
    }
}
