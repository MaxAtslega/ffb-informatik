package de.atslega.chapter03.sort;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String t = "abcd";
        String t2 = "abce";


        Person[] persons = new Person[]{new Person("Jan", "Mai", "test@mail.de"),
                new Person("Kai", "Dux", "test@mail.de"),
                new Person("Ina", "Fox", "test@mail.de"),
                new Person("Liz", "Tik", "test@mail.de"),
                new Person("Teo", "Fox", "test@mail.de"),
                new Person("Jil", "Fiz", "test@mail.de")};

        Person[] test = insertionSort(persons);

        persons[1] = new Person("Ina", "Fox", "test@mail.de");

        for (Person person : persons){
            System.out.println(person);
        }
    }

    // Stabilität / In-Place
    public static Person[] insertionSort(Person[] list) {
        int n = list.length;

        for (int k = 1; k < n; k++) {
            Person temp = list[k];
            int j = k - 1;
            while (j >= 0 && temp.getName().compareTo(list[j].getName()) < 0) {
                list[j + 1] = list[j];
                j--;
            }
            while (j >= 0 && temp.getName().equals(list[j].getName()) &&
                    temp.getForename().compareTo(list[j].getForename()) < 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }

        return list;
    }

    // In-Place
    public static void selectionSort(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++)  {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j].getName().compareTo(arr[index].getName()) < 0 ||
                        (arr[j].getName().equals(arr[index].getName()) &&
                                arr[j].getForename().compareTo(arr[index].getForename()) < 0)) {
                    index = j;
                }
            }
            Person smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    // Stabilität / In-Place
    public static void bubbleSort(Person arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getName().compareTo(arr[j+1].getName()) > 0 ||
                        (arr[j].getName().equals(arr[j+1].getName()) &&
                                arr[j].getForename().compareTo(arr[j+1].getForename()) > 0)) {
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(arr[j] + "  - "+arr[j + 1]);
                }
    }
}

class Person {
    private String name;
    private String forename;
    private String mail;

    public Person(String forename, String name, String mail) {
        this.forename = forename;
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getForename() {
        return forename;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", forename='" + forename + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
