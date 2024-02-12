package string.Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","floght"};
        System.out.println(longestCommonPrefix(strs));

    }
    static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");
        Arrays.sort(strs);

        char [] first = strs[0].toCharArray();
        char [] last = strs[strs.length-1].toCharArray();

        for (int i=0; i<first.length;i++) {
            if(first[i]!=last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

}
