package Sorting.BinarySearch.Leetcode;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] nums = {5,7,7,7,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int left = leftBound(nums,target);
        int right = rightBound(nums,target);

        return new int[]{left,right};
    }
    static int leftBound(int [] nums, int target) {
        int index = -1 ;
        int start = 0 ;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid]==target) {
                index = mid ;
                end = mid - 1;
            } else if (nums[mid]<target) {
                start = mid +1 ;

            } else {
                end = mid - 1;
            }
        }
        return index ;
    }

    static int rightBound(int [] nums, int target) {
        int index = -1 ;
        int start = 0 ;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid]==target) {
                index = mid ;
                start = mid + 1;
            } else if (nums[mid]<target) {
                start = mid +1 ;

            } else {
                end = mid - 1;
            }
        }
        return index ;
    }
}
