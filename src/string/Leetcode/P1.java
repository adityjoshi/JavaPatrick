/*
reverse each word in string
 */

package string.Leetcode;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sen = new StringBuilder(in.nextLine());
        int n = sen.length();
        int i = 0 ;
        int j = 0;

        while (j < n) {
            if (sen.charAt(j) != ' ') {
                j++ ;
            } else {
                reverse(sen,i,j-1);
                i = j+1;
                j=i ;
            }
        }
        reverse(sen,i,j-1);
        System.out.println(sen);
    }
    static void reverse(StringBuilder sen, int i , int j) {
        while (i < j) {
            char temp = sen.charAt(i);
            sen.setCharAt(i, sen.charAt(j));
            sen.setCharAt(j,temp);
            i++ ;
            j--;
        }
    }
}
