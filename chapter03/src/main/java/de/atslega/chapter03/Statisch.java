package de.atslega.chapter03;

// Statische Polymorphie
/*
    überladen von Methoden
 */
public class Statisch {
    public static void printArea(double r) {
        System.out.println("Area: " + Math.PI * r * r);
    }

    public static void printArea(double a, double b) {
        System.out.println("Area: " + a * b);
    }

    public static void main(String[] args) {
        printArea(1.0); // Area: 3.141592653589793 (ruft die erste Methode auf)
        printArea(2.0, 3.0); // Area: 6
    }
}
