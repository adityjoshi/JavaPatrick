package string.Leetcode;

public class OddNumInString {
    public static void main(String[] args) {
        String s = "52683" ;
        System.out.println(largestOddNumber(s));

    }
    static String largestOddNumber(String num) {
        for (int i = num.length()-1; i>=0; i--) {
            if(Character.getNumericValue(num.charAt(i))%2 !=0 ) {
                return num.substring(0,i+1);
            }

        }
        return  "";
    }
    }

