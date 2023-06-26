package de.atslega.chapter03;
// Dynamische Polymorphie

class Shape {
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double area() { // überschriebene Methode
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double s) {
        side = s;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class Dynamisch {

    public static void printArea(Shape s) {
        System.out.println("Area: " + s.area());
    }

    public static void main(String[] args) {
        Shape c = new Circle(1.0);
        Shape s = new Square(2.0);

        printArea(c); // Area: 3.141592653589793
        printArea(s); // Area: 4.0

    }
}