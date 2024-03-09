package Sorting.BinarySearch.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 6 ;
        int x = 9 ;
        System.out.println(findClosestElements(arr,k,x));

    }
    static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int lowerBound = n;
        int start = 0;
        int end = n - 1;

        if (x < arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        if (x > arr[n - 1]) {
            for (int i = n - 1; i >= n - k; i--) {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x) {
                lowerBound = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (lowerBound == 0) {
                break;
            }
        }

        int i = lowerBound - 1;
        int j = lowerBound;
        while (k > 0 && i >= 0 && j < n) {
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);
            if (di <= dj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }

        while (i >= 0 && k > 0) {
            ans.add(arr[i]);
            i--;
            k--;
        }

        while (j < n && k > 0) {
            ans.add(arr[j]);
            j++;
            k--;
        }

        Collections.sort(ans);
        return ans;
    }
}
