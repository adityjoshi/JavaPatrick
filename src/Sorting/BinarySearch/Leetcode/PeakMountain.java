package Sorting.BinarySearch.Leetcode;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2};
        System.out.println(findPeakElement(arr));
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid ;
            }
        }
        return start ;

    }

}
