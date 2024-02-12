
/*
https://leetcode.com/problems/rotate-string/

do one more time
 */


package string.Leetcode;

public class RotateString {
    public static void main(String[] args) {
       String s = "abcde";
       String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
    static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
}
