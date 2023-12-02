package de.atslega.arztpraxis.personen;

import de.atslega.arztpraxis.queue.Prioritizable;

public class Patient extends Person implements Prioritizable {
    private int alter;
    private boolean chronischKrank;

    private final boolean priority;

    public Patient(String name, String geschlecht, int alter, boolean chronischKrank, boolean priority) {
        super(name, geschlecht);
        this.alter = alter;
        this.chronischKrank = chronischKrank;
        this.priority = priority;
    }

    public Patient(String name, String geschlecht, int alter, boolean chronischKrank) {
        super(name, geschlecht);
        this.alter = alter;
        this.chronischKrank = chronischKrank;
        this.priority = false;
    }

    public void beiPraxisAnmelden(){

    }

    public void pruefeKrankheit() {
        if (chronischKrank = true) {
            System.out.println("Ist chronischKrank");

        } else {
            System.out.println("Ist nicht chronisch Krak");
        }
    }
    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isChronischeKrank() {
        return chronischKrank;
    }

    public void setChronischeKrank(boolean chronischKrank) {
        this.chronischKrank = chronischKrank;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean isPriority() {
        return priority;
    }
}
