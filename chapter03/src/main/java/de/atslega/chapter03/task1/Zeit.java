package de.atslega.chapter03.task1;

public class Zeit {
    private String sec;

    public Zeit(int sec) {
        this.sec = sec + "";
    }

    public Zeit(String sec) {
        this.sec = sec;
    }

    public void setSec(int sec) {
        this.sec = sec + "";
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getSec(int x) {
        return sec;
    }

    public void showTime() {
        return;
    }
}
