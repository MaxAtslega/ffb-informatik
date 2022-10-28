package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class Rechnen {
    public static void main(String[] args) {
        System.out.println("Rechenoperatoren für ganze Zahlen");
        Scanner input = new Scanner(System.in);

        System.out.print("1. ganze Zahl: ");
        int zahl1 = Integer.parseInt(input.nextLine());

        System.out.print("2. ganze zahl: ");
        int zahl2 = Integer.parseInt(input.nextLine());

        System.out.println(zahl1 + " + " + zahl2 + " = "+ (zahl1+zahl2));
        System.out.println(zahl1 + " - " + zahl2 + " = "+ (zahl1-zahl2));
        System.out.println(zahl1 + " * " + zahl2 + " = "+ (zahl1*zahl2));
        System.out.println(zahl1 + " / " + zahl2 + " = "+ (zahl1/zahl2));
        System.out.println(zahl1 + " % " + zahl2 + " = "+ (zahl1%zahl2));

        System.out.println("Programmende Rechnen.");
    }
}
