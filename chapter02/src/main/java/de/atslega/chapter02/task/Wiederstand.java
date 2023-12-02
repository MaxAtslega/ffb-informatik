package de.atslega.chapter02.task;

import java.util.Scanner;

public class Wiederstand {
    public static void main(String[] args) {
        System.out.println("Widerstands-Schaltung");

        Scanner input = new Scanner(System.in);

        System.out.print("(P)arallel- oder (R)eihenschaltung?");
        String schaltung = input.nextLine();

        System.out.print("R1 in Ohm: ");
        double r1 = Double.parseDouble(input.nextLine());

        System.out.print("R2 in Ohm: ");
        double r2 = Double.parseDouble(input.nextLine());

        if (schaltung.equals("P")) {
            double ergebnis = (r1 * r2) / (r1 + r2);
            System.out.println("Das Gesamtwert der Parallelschaltung ist " + ergebnis + " Ohm");
        } else if (schaltung.equals("R")) {
            double ergebnis = r1 + r2;
            System.out.println("Das Gesamtwert der Reihenschaltung ist " + ergebnis + " Ohm");
        } else {
            System.out.println("Die Schaltung existiert nicht.");
        }

        System.out.println("Programmende Wiedersand.");
    }
}
