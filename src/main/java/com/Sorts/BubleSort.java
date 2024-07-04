package com.Sorts;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {8, 2, -1, 4, 12, 0, -9, 1, 2, 2, 3, -100, 100, 9};
        for (int i = 0; i + 1 < array.length; i++) {
            for (int j = 0; j + 1 < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
