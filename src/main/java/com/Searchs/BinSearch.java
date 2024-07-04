package com.Searchs;

public class BinSearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12, 17, 21};
        int target = 3;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        System.out.println(r);
        System.out.println(5 / 2);
    }
}
