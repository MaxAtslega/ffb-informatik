package de.atslega.arztpraxis.personen;

public abstract class Person {
    protected String name;
    protected String geschlecht;

    public Person(String name, String geschlecht) {
        this.name = name;
        this.geschlecht = geschlecht;
    }
}
