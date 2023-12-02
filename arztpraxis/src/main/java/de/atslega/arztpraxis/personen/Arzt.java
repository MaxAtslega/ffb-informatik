package de.atslega.arztpraxis.personen;

import de.atslega.arztpraxis.Arztpraxis;
import de.atslega.arztpraxis.raum.Behandlungszimmer;

import java.util.ArrayList;

public class Arzt extends Angestellter {
    private String fachgebiet;
    private Behandlungszimmer aktuellesBehandlungszimer;
    private Arztpraxis arztpraxis;

    public Arzt(String name, String geschlecht, double gehalt, String fachgebiet, Arztpraxis arztpraxis) {
        super(name, geschlecht, gehalt);
        this.fachgebiet = fachgebiet;
        this.arztpraxis = arztpraxis;
    }

    public void behandlungszimmerBesetzen(Behandlungszimmer behandlungszimmer){
        this.aktuellesBehandlungszimer = behandlungszimmer;
        behandlungszimmer.setArzt(this);
    }

    public void behandlungszimmerverlassen(){
        this.aktuellesBehandlungszimer = null;
    }
    public void patientBehandeln(Patient patient){
        aktuellesBehandlungszimer.setPatient(patient);
    }
    public void patientAufrufen(Patient patient){
        return;
    }
}

