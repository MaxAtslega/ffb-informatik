package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class Ganzteil {
    public static void main(String[] args) {
        System.out.println("Ganzzahlige Division mit Rest");

        Scanner input = new Scanner(System.in);

        System.out.print("Dividend: ");
        int dividend = Integer.parseInt(input.nextLine());

        System.out.print("Divisor: ");
        int divisor = Integer.parseInt(input.nextLine());

        int ergebnis = dividend / divisor;
        int rest = dividend % divisor;

        System.out.println("Das Ergebnis der Division ist " + dividend + ":" + divisor + " ist " + ergebnis + " Rest " + rest);

        System.out.println("Programmende Ganzteil.");
    }
}
