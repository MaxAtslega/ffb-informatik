package de.atslega.chapter02.task;

import java.util.Scanner;

public class SumNb {
    public static void main(String[] args) {
        System.out.println("SumNb");
        System.out.println("Berechnung der Summe der Reihe \n 1*1+3*3+5*5+...+(2n-1)*(2n-1)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine pos. ganze Zahl ein (n): ");
        int zahl = Integer.parseInt(scanner.nextLine());

        int add = 0;
        for (int i = 1; i <= zahl; i++) {
            add += (2 * i - 2) * (2 * i - 2);
        }

        System.out.println("Summe ist: " + add);
        System.out.println("Programmende SumNb.");
    }
}
