package com.Sorts;

import java.util.Arrays;

public class ShakerSort {
    public static void main(String[] args) {
        int[] array = {8, 2, -1, 4, 12, 0, -9, 1, 2, 2, 3, -100, 100, 9};
        int left = 0;
        int right = array.length - 1;
        int temp;
        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
        }
        System.out.println(Arrays.toString(array));
    }
}
