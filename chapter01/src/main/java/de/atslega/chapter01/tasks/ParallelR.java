package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class ParallelR {
    public static void main(String[] args) {
        System.out.println("Widerstands-Parallelschaltung");

        Scanner input = new Scanner(System.in);

        System.out.print("R1 in Ohm: ");
        double r1 = Double.parseDouble(input.nextLine());

        System.out.print("R2 in Ohm: ");
        double r2 = Double.parseDouble(input.nextLine());

        double ergebnis = (r1 * r2) / (r1 + r2);

        System.out.println("Das Gesamtwiederstand ist " + ergebnis + " Ohm");

        System.out.println("Programmende ParallelR.");
    }
}
