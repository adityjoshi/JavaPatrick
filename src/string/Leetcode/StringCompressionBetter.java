
/*
optimised performance using string builder
 */



package string.Leetcode;

public class StringCompressionBetter {
    public static void main(String[] args) {
        String s = "aaaabbcccccdeee";
        char [] arr = s.toCharArray() ;
        StringBuilder ans = new StringBuilder("");
        int i = 0 ;
        int j = 0;
        comp(arr,ans,i,j);
    }
    static void  comp(char [] arr , StringBuilder ans, int i, int j) {
        while (j<arr.length) {
            if(arr[j]==arr[i]) {
                j++ ;
            } else {
                ans.append(arr[i]) ;
                int length = j-i;
                if (length >1) {
                    ans.append(length) ;
                }
                i=j;
            }
        }
        ans.append(arr[i]) ;
        int length = j-i;
        if (length >1) {
            ans.append(length);
        }
        System.out.println(ans);
    }
}
