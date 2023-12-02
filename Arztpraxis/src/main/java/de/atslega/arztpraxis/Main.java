package de.atslega.arztpraxis;

import de.atslega.arztpraxis.personen.Arzt;
import de.atslega.arztpraxis.personen.Arzthelfer;
import de.atslega.arztpraxis.personen.Patient;
import de.atslega.arztpraxis.queue.Queue;
import de.atslega.arztpraxis.raum.Behandlungszimmer;
import de.atslega.arztpraxis.raum.BehandlungszimmerTyp;
import de.atslega.arztpraxis.raum.Wartezimmer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Arzt> aerzte = new ArrayList<>();
        ArrayList<Patient> patienten = new ArrayList<>();
        Queue patientenImZimmer = new Queue();

        ArrayList<Behandlungszimmer> behandlungszimmer = new ArrayList<>();
        ArrayList<Arzthelfer> arzthelfer = new ArrayList<>();

        Wartezimmer wartezimmer = new Wartezimmer(14, 23, 40, 12, patientenImZimmer);

        Arztpraxis arztpraxis = new Arztpraxis(aerzte, arzthelfer, patienten, wartezimmer, behandlungszimmer);

        Arzthelfer max = new Arzthelfer(10 , arztpraxis, "Max", "M");

        Patient samuel = new Patient("Samuel", "M", 16, true);
        Patient leon = new Patient("Leon", "M", 19, false);
        Patient lasse = new Patient("Lasse", "M", 17, true, true);

        Behandlungszimmer behandlungszimmer1 = new Behandlungszimmer(1, 2, 10, BehandlungszimmerTyp.Roentgenraum);

        arztpraxis.arztEinstellen(new Arzt("Karl", "M", 10.5, "Katze", arztpraxis));
        arztpraxis.getBehandlungszimmer().add(behandlungszimmer1);
        arztpraxis.arzthelferEinstellen(max);

        arztpraxis.getPatienten().add(samuel);
        arztpraxis.getPatienten().add(leon);
        arztpraxis.getPatienten().add(lasse);

        max.patientInsWartezimmerSchicken(samuel);
        max.patientInsWartezimmerSchicken(leon);
        max.patientInsWartezimmerSchicken(lasse);


        max.nächstenPatientInsBehandlungszimmerSchicken(behandlungszimmer1);

        arztpraxis.angestelltenKuendigen(max);


        System.out.println(behandlungszimmer1.getPatient().getName());
        System.out.println(arztpraxis.getWartezimmer().getPatientenImZimmer().display());
    }
}