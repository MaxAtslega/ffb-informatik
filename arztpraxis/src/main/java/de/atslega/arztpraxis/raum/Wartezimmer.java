package de.atslega.arztpraxis.raum;

import de.atslega.arztpraxis.personen.Patient;
import dev.atslega.dds.queue.generic.GenericQueue;

public class Wartezimmer extends Raum{
    private int anzahlPlaetze;
    private GenericQueue<Patient> patientenImZimmer;

    public Wartezimmer(int anzahlTueren, int anzahlFenster, double flaeche, int anzahlPlaetze, GenericQueue<Patient> patientenImZimmer) {
        super(anzahlTueren, anzahlFenster, flaeche);
        this.anzahlPlaetze = anzahlPlaetze;
        this.patientenImZimmer = patientenImZimmer;
    }

    public GenericQueue getPatientenImZimmer() {
        return patientenImZimmer;
    }
}
