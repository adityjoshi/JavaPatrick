package string.Leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
    String s = "aadi";
    String t = "idaa";
        System.out.println(isAnagram(s,t));
    }
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false ;
        }
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if(a[i]!=b[i]){
                return false ;
            }
        }
        return true ;
    }
}
