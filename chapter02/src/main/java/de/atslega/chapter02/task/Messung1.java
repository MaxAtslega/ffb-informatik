package de.atslega.chapter02.task;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Scanner;

public class Messung1 {
    public static void main(String[] args) {
        System.out.println("Messung1");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Messwerte: ");
        int anzahl = Integer.parseInt(scanner.nextLine());

        if (anzahl == 0){
            System.out.println("Falsche Angabe.");
            System.exit(0);
        }

        int[] ergebnisse = new int[anzahl];
        int summe = 0;
        for (int i = 1; i < anzahl+1; i++){
            System.out.print(i+". Ergebnis der Messung: ");
            int ergebnis = Integer.parseInt(scanner.nextLine());
            ergebnisse[i-1] = ergebnis;
            summe+=ergebnis;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int e : ergebnisse){
            stringBuilder.append(e).append(" ");
        }

        System.out.println("Deine Angabe: " + stringBuilder);
        System.out.println("Durchschnitt: " + summe / anzahl);

        System.out.println("Min: " + getMin(ergebnisse));
        System.out.println("Max: " + getMax(ergebnisse));

        System.out.println("Programmende Messung1");

    }

    public static int getMin(int[] list) {
        int min = list[0];

        for (int number : list){
            if (number < min) {
                min = number;
            }

        }

        return min;
    }

    public static int getMax(int[] list) {
        int max = list[0];

        for (int number : list){
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
