package de.atslega.arztpraxis.personen;

import de.atslega.arztpraxis.Arztpraxis;
import de.atslega.arztpraxis.raum.Behandlungszimmer;

import java.util.ArrayList;

public class Arzt extends Angestellter {
    private String fachgebiet;
    private Behandlungszimmer aktuellesBehandlungszimmer;
    private Arztpraxis arztpraxis;

    public Arzt(String fachgebiet, Behandlungszimmer aktuellesBehandlungszimmer, Arztpraxis arztpraxis) {
        this.fachgebiet = fachgebiet;
        this.aktuellesBehandlungszimmer = aktuellesBehandlungszimmer;
        this.arztpraxis = arztpraxis;

        ArrayList<Arzt> arzts = new ArrayList<>();


    }

    public void behandlungszimmerBesetzen(){

    }

    public void behandlungszimmerVerlassen() {

    }

    public void patientAufrufen() {

    }
}
