package de.atslega.chapter02.task;

import java.util.Scanner;

public class SumNd {
    public static void main(String[] args) {
        System.out.println("SumNd");
        System.out.println("Berechnung der Summe der Reihe \n 1+1/2+1/3+...+1/n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine pos. ganze Zahl ein (n): ");
        int zahl = Integer.parseInt(scanner.nextLine());

        int add = 0;
        for (int i = 1; i <= zahl; i++) {
            add += (1 / i);
        }

        Math.pow(2, 2);

        System.out.println("Summe ist: " + add);
        System.out.println("Programmende SumNd.");
    }
}
