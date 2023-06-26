package de.atslega.chapter03.sort;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(ggT(50, 60));
        System.out.println(factorial(4));
        System.out.println(kapital(4));
        System.out.println(medikamentenmenge(5));

        System.out.println(flaecheninhalt(4,9));
        System.out.println(umfang(4,9));
    }

    public static int factorial(int n){
        if (n <= 1) return 1;
        return factorial(n-1)*n;
    }

    // fak(0) = 1
    // fak(n) = n * fak(n-1)

    /*
    fak(4) = 4 * fak(3) = 4 * 3 * 2 * 1 = 24
    fak(3) = 3 * fak(2) = 3 * 2 * 1;
    fak(2) = 2 * fak(1) = 2 * 1;
    fak(1) = 1
    fak(2) = 2 * 1;
    fak(3) = 3 * 2 * 1;
    fak(4) = 4 * 3 * 2 * 1 = 24;
     */

    public static int ggT(int a, int b){
        if (a == b) return a;
        if(a > b) return ggT(a-b, b);
        return ggT(a, b-a);
    }

    /*
    *
    *
    * */

    public static double kapital(int n){
        if (n <= 0) return 1000;
        return kapital(n-1)*1.05;
    }

    public static double medikamentenmenge(int n){
        if (n <= 0) return 5;
        return medikamentenmenge(n-1)*0.6+5;
    }

    public static double flaecheninhalt(int n, double m){
        if (n <= 0) return m*m;
        return flaecheninhalt(n-1, m) + (m*m) / (Math.pow(3, n));
    }

    public static double umfang(int n, double m) {
        if (n <= 0) return m * 4;
        return umfang(n-1, m)+2*m;
    }
    //f(0) = 40
    //f(1) == 40 + ((5*4)*(3^1)
    //f(2) = 144 + ((6*6)*3)^1 + ((2*2)*3)^2
}
