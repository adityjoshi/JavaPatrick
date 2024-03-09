package Sorting.BinarySearch.Leetcode;

import java.util.ArrayList;

public class KthElement {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (x<arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
        }

    }
}
