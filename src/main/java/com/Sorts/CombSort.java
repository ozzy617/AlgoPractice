package com.Sorts;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] array = {8, 2, -1, 4, 12, 0, -9, 1, 2, 2, 3, -100, 100, 9};
        double factor = 1.247;
        double step = array.length - 1;
        while(step >= 1) {
            for (int  i = 0; i + (int) step < array.length; i++) {
                if (array[i] > array[i + (int) step]) {
                    int temp = array[i];
                    array[i] =  array[i + (int) step];
                    array[i + (int) step] = temp;
                }
            }
            step /= factor;
        }
        System.out.println(Arrays.toString(array));
    }
}
