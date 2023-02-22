package de.atslega.arztpraxis;

import de.atslega.arztpraxis.personen.Angestellter;
import de.atslega.arztpraxis.personen.Arzt;
import de.atslega.arztpraxis.personen.Arzthaelfer;
import de.atslega.arztpraxis.personen.Patient;
import de.atslega.arztpraxis.raum.Behandlungszimmer;
import de.atslega.arztpraxis.raum.Wartezimmer;

import java.util.ArrayList;

public class Arztpraxis {
    private ArrayList<Arzt> arzte;
    private ArrayList<Arzthaelfer> arzthaelfer;
    private ArrayList<Patient> patienten;
    private Wartezimmer wartezimmer;

    public Arztpraxis(ArrayList<Arzt> arzte, ArrayList<Arzthaelfer> arzthaelfer, ArrayList<Patient> patienten, Wartezimmer wartezimmer, ArrayList<de.atslega.arztpraxis.raum.Behandlungszimmer> behandlungszimmer) {
        this.arzte = arzte;
        this.arzthaelfer = arzthaelfer;
        this.patienten = patienten;
        this.wartezimmer = wartezimmer;
    }

    public void arztEinstellen(Arzt arzt){
        arzte.add(arzt);
    }

    public void arzthelferEinstellen(Arzthaelfer arzthaelfer){
        this.arzthaelfer.add(arzthaelfer);
    }

    public void arzthelferKuendigen(Arzthaelfer arzthaelfer){
        this.arzthaelfer.remove(arzthaelfer);
    }

    public ArrayList<Arzt> getArzte() {
        return arzte;
    }

    public ArrayList<Arzthaelfer> getArzthaelfer() {
        return arzthaelfer;
    }

    @Override
    public String toString() {
        return "Arztpraxis{" +
                "arzte=" + arzte +
                ", arzthaelfer=" + arzthaelfer +
                ", patienten=" + patienten +
                ", wartezimmer=" + wartezimmer +
                '}';
    }
}
