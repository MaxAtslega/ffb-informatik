package de.atslega.arztpraxis.personen;

import de.atslega.arztpraxis.Arztpraxis;
import de.atslega.arztpraxis.raum.Behandlungszimmer;

public class Arzthelfer extends Angestellter {
    private Arztpraxis arztpraxis;

    public Arzthelfer(double gehalt, Arztpraxis arztpraxis, String name, String geschlecht) {
        super(name, geschlecht, gehalt);
        this.arztpraxis = arztpraxis;
    }

    public void patientAufnehemen(Patient patient){
        arztpraxis.getPatienten().add(patient);
    }
    public void patientInsWartezimmerSchicken(Patient patient){
        arztpraxis.getWartezimmer().getPatientenImZimmer().add(patient);
    }
    public void patientInsBehandlungszimmerSchicken(Patient patient, Behandlungszimmer behandlungszimmer){
        for (Behandlungszimmer behandlungszimmerFromList : arztpraxis.getBehandlungszimmer()) {
            if(behandlungszimmerFromList == behandlungszimmer){
                behandlungszimmerFromList.setPatient(patient);
            }
        }
    }
    public void patientEntfernen(Patient patient){
        arztpraxis.getPatienten().remove(patient);
    }
}

