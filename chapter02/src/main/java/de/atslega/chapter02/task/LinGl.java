package de.atslega.chapter02.task;

import java.util.Scanner;

public class LinGl {
    public static void main(String[] args) {
        System.out.println("Gleichung ax+b=0");
        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        int a = Integer.parseInt(input.nextLine());

        if (a == 0) {
            System.out.println("Kann nicht gelöst werden");
            return;
        }

        System.out.print("B: ");
        int b = Integer.parseInt(input.nextLine());

        System.out.println("Lösung: x=" + ((-b) / a));

        System.out.println("Programmende LinGl.");
    }
}
