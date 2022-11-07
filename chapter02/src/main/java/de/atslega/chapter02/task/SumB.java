package de.atslega.chapter02.task;

import java.util.Scanner;

public class SumB {
    public static void main(String[] args) {
        System.out.println("SumB");
        System.out.println("Berechnung der Summe 1-2+3-4+5...+(2n+1) - 2n +.. bis zum Grenzwert");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Grenzwert: ");
        int grenzwert = Integer.parseInt(scanner.nextLine());

        int i = 1;
        int sum = 0;
        while (sum <= grenzwert){
            if(i % 2 == 0){
                sum-=i;
            } else {
                sum+=i;
            }
            i++;
        }

        System.out.println("Nach " + (i-1) + " Gliedern ist " + grenzwert + " erreicht. Die Summe ist " + sum);
        System.out.println("Programmende SumB");
    }
}
