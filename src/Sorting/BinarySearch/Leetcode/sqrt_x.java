package Sorting.BinarySearch.Leetcode;

public class sqrt_x {
    public static void main(String[] args) {
        int x = 16 ;
        System.out.println(mySqrt(x));
        System.out.println(mySqrt2(x));
    }

    // this is the fastest method => newton repson method
     static int mySqrt(int x) {
        return (int)(Math.sqrt(x));

    }
    static int mySqrt2(int x) {
        int start = 0 ;
        int end  = x ;
        while (start <= end) {
            int mid = start + (end - start)/2 ;
            if (mid*mid == x) {
                return mid ;
            } else if (mid*mid > x) {
                end = mid - 1 ;
            } else {
                start = mid +1 ;
            }
        }
        return end;
    }
}
