package de.atslega.chapter02.task;

import java.util.Scanner;

public class MonName {
    public static void main(String[] args) {
        System.out.println("Ausgabe des Monatsname");
        Scanner input = new Scanner(System.in);

        System.out.print("Nummer des Monats (1..12): ");
        int monat = Integer.parseInt(input.nextLine());

        if (!(monat >= 1 && monat <= 12)) {
            System.out.println("Der Monat ist Ungültig.");
        } else {
            String monatsname = switch (monat) {
                case 1 -> "Januar";
                case 2 -> "Februar";
                case 3 -> "März";
                case 4 -> "April";
                case 5 -> "Mai";
                case 6 -> "Juni";
                case 7 -> "Juli";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "Oktober";
                case 11 -> "November";
                case 12 -> "Dezember";
                default -> "Ungültig";
            };
            System.out.println("Der " + monat + ". Monat heißt " + monatsname);
        }


        System.out.println("Programmende MonName");
    }
}
