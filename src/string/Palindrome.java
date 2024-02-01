package string;

public class Palindrome {
    public static void main(String[] args) {
        String x = "abcbcba";
        System.out.println(check(x));
    }
    static boolean check(String x) {
        for(int i = 0 ; i<= x.length()/2; i++) {
            char start = x.charAt(i);
            char end = x.charAt(x.length()-1-i);

            if (start != end) {
                return false;
            }
        }
        return true ;
    }
}
