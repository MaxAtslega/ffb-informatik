package de.atslega.arztpraxis.liste;

public class Main {

    public static void main(String[] args) {
        List list = new List();

        list.append(1);
        list.append(2);
        list.append(3);

        list.back();
        list.insert(5);
        list.append(4);

        System.out.println(list.getObject());

        System.out.println(list.display());

    }
}
