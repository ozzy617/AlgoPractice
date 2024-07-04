package com.Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8, 2, -1, 4, 12, 0, -9, 1, 2, 2, 3, -100, 100};
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
