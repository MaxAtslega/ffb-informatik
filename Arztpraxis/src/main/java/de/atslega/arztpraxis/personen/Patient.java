package de.atslega.arztpraxis.personen;

public class Patient extends Person{
    private int alter;
    private boolean chronischeKrank;

    public Patient(int alter, boolean chronischeKrank) {
        this.alter = alter;
        this.chronischeKrank = chronischeKrank;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isChronischeKrank() {
        return chronischeKrank;
    }

    public void setChronischeKrank(boolean chronischeKrank) {
        this.chronischeKrank = chronischeKrank;
    }

    public void beiPraxisAnmelden(){

    }
}
