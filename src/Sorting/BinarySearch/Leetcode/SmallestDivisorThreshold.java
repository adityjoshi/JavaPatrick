package Sorting.BinarySearch.Leetcode;

public class SmallestDivisorThreshold {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int target = 6;
        //System.out.println(smallestNum(arr, target));
        System.out.println(smallestDivisor(arr,target));
    }


    // Brute force approach
    static int smallestNum(int[] arr, int t) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int d;
        for (d = 1; d <= max; d++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % d == 0) {
                    sum += arr[i] / d;
                } else {
                    sum += arr[i] / d + 1;
                }

            }
            if (sum <= t) {
                return d;
            }
        }
        return d;
    }

    // Binary search
    static int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int start = 1;
        int end = max;
        int divisor = - 1;
        while (start <= end) {
        int mid = start + (end-start)/2 ;
        if(isLess(mid,arr,threshold)) {
            divisor = mid ;
            end = mid - 1;
        }
        else start = mid + 1;
        }
        return divisor ;

    }

    static boolean isLess(int mid, int[] arr, int t) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0) {
                sum += arr[i] / mid;
            } else {
                sum += arr[i]/mid + 1;
            }
        }
        if(sum <= t) {
            return true ;
        }
        return false ;
    }
}