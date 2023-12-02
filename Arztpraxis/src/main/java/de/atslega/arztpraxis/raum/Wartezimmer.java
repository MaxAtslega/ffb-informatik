package de.atslega.arztpraxis.raum;

import de.atslega.arztpraxis.personen.Patient;
import de.atslega.arztpraxis.queue.Queue;


public class Wartezimmer extends Raum{
    private int anzahlPlaetze;
    private Queue patientenImZimmer;

    public Wartezimmer(int anzahlTueren, int anzahlFenster, double flaeche, int anzahlPlaetze, Queue patientenImZimmer) {
        super(anzahlTueren, anzahlFenster, flaeche);
        this.anzahlPlaetze = anzahlPlaetze;
        this.patientenImZimmer = patientenImZimmer;
    }

    public Queue getPatientenImZimmer() {
        return patientenImZimmer;
    }
}
