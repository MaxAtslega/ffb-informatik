package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class PunktAbstand {
    public static void main(String[] args) {
        System.out.println("Punktabstand");

        Scanner input = new Scanner(System.in);

        System.out.print("1.Punkt x: ");
        double punkt1x = Double.parseDouble(input.nextLine());

        System.out.print("1.Punkt y: ");
        double punkt1y = Double.parseDouble(input.nextLine());

        System.out.print("2.Punkt x: ");
        double punkt2x = Double.parseDouble(input.nextLine());

        System.out.print("2.Punkt y: ");
        double punkt2y = Double.parseDouble(input.nextLine());

        double abstand = Math.sqrt((punkt2x - punkt1x)*(punkt2x - punkt1x) + (punkt2y - punkt1y)*(punkt2y - punkt1y));

        System.out.println("Der Punktabstand: "+ abstand);

        System.out.println("Programmende Punktabstand.");
    }
}
