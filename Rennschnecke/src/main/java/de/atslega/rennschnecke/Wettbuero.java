package de.atslega.rennschnecke;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Wettbuero {
    private Rennen entgegengenommendeWette;
    private ArrayList<Wette> angenommenenWetten;
    private ArrayList<Wette> abgeschlossendenWetten;
    private double multiplikationsFaktorBeiGewonnenenspielen;

    public Wettbuero(Rennen entgegengenommendeWette, ArrayList<Wette> angenommenenWetten, double multiplikationsFaktorBeiGewonnenenspielen) {
        this.entgegengenommendeWette = entgegengenommendeWette;
        this.angenommenenWetten = angenommenenWetten;
        this.multiplikationsFaktorBeiGewonnenenspielen = multiplikationsFaktorBeiGewonnenenspielen;

        this.abgeschlossendenWetten = new ArrayList<Wette>();
    }

    public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler){
        angenommenenWetten.add(new Wette(schneckenName, wettEinsatz, spieler));
    }

    public void rennenDurchfuehren(){
        double laenge = entgegengenommendeWette.getLaengeDerZuKriechendenStrecke();
        ArrayList<Rennschnecke> rennschnecken = new ArrayList<Rennschnecke>();
        for (Rennschnecke rennschnecke : entgegengenommendeWette.getTeilnehmendenSchnecken()){
            if(rennschnecke.getZurueckgelegterWeg() >= laenge){
                rennschnecken.add(rennschnecke);
            }
        }

        for (Wette wette : angenommenenWetten){
            System.out.println(wette.toString());
            for (Rennschnecke rennschnecke : rennschnecken){
                if(wette.getSchneckenName().contains(rennschnecke.getName())){
                    wette.setGewinn(wette.getWettEinsatz()*multiplikationsFaktorBeiGewonnenenspielen);
                    abgeschlossendenWetten.add(wette);
                }
            }
        }

    }

    public String toString(){
        return String.format("Rennen: [%s], abgeschlossendeWetten: [(%s)]", entgegengenommendeWette, abgeschlossendenWetten.stream().map(Wette::toString).collect(Collectors.joining("), (")));
    }
}
