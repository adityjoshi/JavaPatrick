package Sorting.BinarySearch.Problems;

public class LowerBound {
    public static void main(String[] args) {
        int [] arr = {10,20,30,30,40,50};
        int target = 30;
        // System.out.println(bs(arr,target));
        System.out.println(upperBound(arr,target));
    }
    static int bs(int [] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        int lowerBound = arr.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target) {
                return mid;
            } else if (arr[mid]>=target) {
                lowerBound = Math.min(mid,lowerBound);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lowerBound ;
    }
    static int upperBound(int [] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        int UpperBound = arr.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]>target) {
                UpperBound = Math.min(mid,UpperBound);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return UpperBound ;
    }
}

