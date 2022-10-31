package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class Rechnen {
    public static void main(String[] args) {
        System.out.println("Rechenoperatoren für ganze Zahlen");
        Scanner input = new Scanner(System.in);

        System.out.print("1. ganze Zahl: ");
        double zahl1 = Double.parseDouble(input.nextLine());

        System.out.print("2. ganze zahl: ");
        double zahl2 = Double.parseDouble(input.nextLine());

        System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
        System.out.println(zahl1 + " - " + zahl2 + " = " + (zahl1 - zahl2));
        System.out.println(zahl1 + " * " + zahl2 + " = " + (zahl1 * zahl2));
        System.out.println(zahl1 + " / " + zahl2 + " = " + (zahl1 / zahl2));
        System.out.println(zahl1 + " % " + zahl2 + " = " + (zahl1 % zahl2));

        System.out.println("Programmende Rechnen.");
    }
}
