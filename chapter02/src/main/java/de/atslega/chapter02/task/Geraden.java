package de.atslega.chapter02.task;

import java.util.Scanner;

public class Geraden {
    public static void main(String[] args) {
        System.out.println("Schnittpunktberechnen");

        Scanner input = new Scanner(System.in);

        System.out.print("ax: ");
        double x1 = Double.parseDouble(input.nextLine());

        System.out.print("ay: ");
        double y1 = Double.parseDouble(input.nextLine());

        System.out.print("bx: ");
        double x2 = Double.parseDouble(input.nextLine());

        System.out.print("by: ");
        double y2 = Double.parseDouble(input.nextLine());

        System.out.print("cx: ");
        double x3 = Double.parseDouble(input.nextLine());

        System.out.print("cy: ");
        double y3 = Double.parseDouble(input.nextLine());

        System.out.print("dx: ");
        double x4 = Double.parseDouble(input.nextLine());

        System.out.print("dy: ");
        double y4 = Double.parseDouble(input.nextLine());

        if ((y2 - y1) * (x4 - x3) - (y4 - y3) * (x2 - x1) == 0) {
            System.out.println("Die Geraden sind parallel. Kein Schnittpunkt");
        } else {

            double zx = (x1 * y2 - y1 * x2) - (x1 - x2) * (x3 * y4 - y3 * x4);
            double zy = (x1 * y2 - y1 * x2) - (y1 - y2) * (x3 * y4 - y3 * x4);

            // Nenner
            double n = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

            // Koordinaten des Schnittpunktes
            double x = zx / n;
            double y = zy / n;

            System.out.println("Schnittpunkt: x=" + x + "; y=" + y);
        }

        System.out.println("Programmende Geraden");


    }


}
