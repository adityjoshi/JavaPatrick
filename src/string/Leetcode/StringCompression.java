

/*
https://leetcode.com/problems/string-compression/description/
 */

package string.Leetcode;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
      String s = "aaaabbcccccdeee";
      char [] arr = s.toCharArray() ;
      String ans = "" ;
      int i = 0 ;
      int j = 0;
      comp(arr,ans,i,j);
    }
    static void  comp(char [] arr , String ans, int i, int j) {
        while (j<arr.length) {
            if(arr[j]==arr[i]) {
                j++ ;
            } else {
                ans += arr[i] ;
                int length = j-i;
                if (length >1) {
                    ans += length ;
                }
                i=j;
            }
        }
        ans += arr[i] ;
        int length = j-i;
        if (length >1) {
            ans += length ;
                }
        System.out.println(ans);
    }
}
