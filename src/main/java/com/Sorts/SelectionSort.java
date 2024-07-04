package com.Sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 2, -1, 4, 12, 0, -9, 1, 2, 2, 3, 100, -100};
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
