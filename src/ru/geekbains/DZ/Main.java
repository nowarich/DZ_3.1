package ru.geekbains.DZ;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array = {
                1, 2, 3, 4, 5
        };
        swap(array, 4, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//        System.out.println(array.toString()); // override? hashcode not working

        System.out.println(toList(array));
//        Task 3 Apples to Oranges:




    }

    private static int[] swap(int[] Array, int i1, int i2) {
        int buffer = Array[i1];
        Array[i1] = Array[i2];
        Array[i2] = buffer;
        return Array;
    }
    private static ArrayList toList(int[] array) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            arrList.add(array[i]);
        }
        return arrList;
    }
}
