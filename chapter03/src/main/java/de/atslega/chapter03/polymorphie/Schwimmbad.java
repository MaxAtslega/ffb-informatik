package de.atslega.chapter03.polymorphie;

public class Schwimmbad extends Sportstaette{
    public Schwimmbad(double grundgebuehr) {
        super(grundgebuehr);
    }


    public double gibGesamtgebuehr(){
        return 0.0;
    }
}
