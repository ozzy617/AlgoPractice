package com.Sorts;

public class CountSort {
    public static void main(String[] args) {
        int min = -100;
        int max = 100;
        int[] array = {8, 2, -1, 4, 12, 0, -9, 1, 2, 2, 3, -100, 100};
        int[] map = new int[max - min + 1];
        for (int n : array) {
            map[n + 100]++;
        }
        int pos = 0;
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i]; j++) {
                array[pos] = i - 100;
                stringBuilder.append(array[pos] + ", ");
                pos++;
            }
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
}
