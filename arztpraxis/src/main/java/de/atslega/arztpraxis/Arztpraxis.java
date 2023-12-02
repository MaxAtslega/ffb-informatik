package de.atslega.arztpraxis;

import de.atslega.arztpraxis.personen.Angestellter;
import de.atslega.arztpraxis.personen.Arzt;
import de.atslega.arztpraxis.personen.Arzthelfer;
import de.atslega.arztpraxis.personen.Patient;
import de.atslega.arztpraxis.raum.Behandlungszimmer;
import de.atslega.arztpraxis.raum.Wartezimmer;

import java.util.ArrayList;

public class Arztpraxis {
    private ArrayList<Arzt> aerzte;
    private ArrayList<Arzthelfer> arzthelfer;
    private ArrayList<Patient> patienten;
    private Wartezimmer wartezimmer;
    private ArrayList<Behandlungszimmer> behandlungszimmer;

    public Arztpraxis(ArrayList<Arzt> aerzte, ArrayList<Arzthelfer> arzthelfer, ArrayList<Patient> patienten, Wartezimmer wartezimmer, ArrayList<Behandlungszimmer> behandlungszimmer) {
        this.aerzte = aerzte;
        this.arzthelfer = arzthelfer;
        this.patienten = patienten;
        this.wartezimmer = wartezimmer;
        this.behandlungszimmer = behandlungszimmer;
    }

    public ArrayList<Arzt> getAerzte() {
        return aerzte;
    }

    public ArrayList<Arzthelfer> getArzthelfer() {
        return arzthelfer;
    }

    public ArrayList<Patient> getPatienten() {
        return patienten;
    }

    public Wartezimmer getWartezimmer() {
        return wartezimmer;
    }

    public ArrayList<Behandlungszimmer> getBehandlungszimmer() {
        return behandlungszimmer;
    }

    public void angestelltenKuendigen(Angestellter angestellter) {
        if (angestellter instanceof Arzt) {
            aerzte.remove(angestellter);
        } else if (angestellter instanceof Arzthelfer) {
            arzthelfer.remove(angestellter);
        }
    }

    public void arztEinstellen(Arzt arzt) {
        aerzte.add(arzt);
    }

    public void arzthelferEinstellen(Arzthelfer arzt) {
        arzthelfer.add(arzt);
    }

    @Override
    public String toString() {
        return "Arztpraxis{" +
                "arzte=" + aerzte +
                ", arzthelfer=" + arzthelfer +
                ", patienten=" + patienten +
                ", wartezimmer=" + wartezimmer +
                '}';
    }
}
