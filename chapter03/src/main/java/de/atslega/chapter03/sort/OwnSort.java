package de.atslega.chapter03.sort;

import java.util.Arrays;

public class OwnSort {

    public static void main(String[] args) {
        int[] array = new int[]{6,5,2,10,11,8};
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] list){
        for (int i = 0; i<list.length-1; i++){
            for (int j = 0; j< list.length-i-1; j++){
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1]= temp;
                }

            }
        }

    }

    public static void selectionSort(int[] list){
        for (int i = 0; i<list.length-1; i++){
            int index = i;

            for (int j = i+1; j<list.length; j++){
                if(list[index] > list[j]){
                    index = j;
                }
            }

            int temp = list[index];
            list[index] = list[i];
            list[i]= temp;

        }
    }

    public static void insertionSort(int[] list){
        for (int i = 1; i<list.length; i++){
            int temp = list[i];

            int j = i-1;
            while(j >= 0 && list[j] > temp){
                list[j+1] = list[j];
                j--;
            }

            list[j+1] = temp;
        }
    }
}
