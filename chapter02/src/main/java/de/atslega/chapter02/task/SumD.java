package de.atslega.chapter02.task;

import java.util.Scanner;

public class SumD {
    public static void main(String[] args) {
        System.out.println("SumD");
        System.out.println("Berechnung der Summe 1+4+9+16+25+... bis zum Grenzwert");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Grenzwert: ");
        int grenzwert = Integer.parseInt(scanner.nextLine());

        int i = 1;
        int sum = 0;
        while (sum <= grenzwert) {
            sum += i * i;
            i++;
        }

        System.out.println("Nach " + (i - 1) + " Gliedern ist " + grenzwert + " erreicht. Die Summe ist " + sum);
        System.out.println("Programmende SumD");
    }
}
