package Sorting.BinarySearch.Leetcode;

public class SearchInsertPositon {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int target = 3;
        System.out.println( searchInsert(arr,target));
    }

        static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;

            while (start<= end) {
                int mid = start + (end-start)/2 ;
                if (nums[mid]==target) {
                    return mid;
                } else if (nums[mid]>target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return start ;
        }
    }

