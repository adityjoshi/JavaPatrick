package Sorting.BinarySearch.Leetcode;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,6,2,3,1};
        System.out.println(peak(arr));
    }
    static int peak(int [] arr) {
        int start = 1 ;
        int end = arr.length-2;

        while (start <= end ) {
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                return mid ;
            } else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return - 1 ;
    }
}
