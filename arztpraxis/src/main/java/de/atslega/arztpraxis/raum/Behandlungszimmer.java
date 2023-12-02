package de.atslega.arztpraxis.raum;

import de.atslega.arztpraxis.personen.Arzt;
import de.atslega.arztpraxis.personen.Patient;

public class Behandlungszimmer extends Raum {
    private BehandlungszimmerTyp funktion;
    private Arzt arzt;
    private Patient patient;

    public Behandlungszimmer(int anzahlTueren, int anzahlFenster, double flaeche, BehandlungszimmerTyp funktion) {
        super(anzahlTueren, anzahlFenster, flaeche);
        this.funktion = funktion;
    }

    public Arzt getArzt() {
        return arzt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setArzt(Arzt arzt) {
        this.arzt = arzt;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
