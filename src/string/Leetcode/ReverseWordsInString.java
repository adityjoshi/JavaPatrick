package string.Leetcode;

public class ReverseWordsInString {
    public static void main(String[] args) {
    String x = "hey i am adi" ;
        System.out.println(reverseWords(x));
    }
    static String reverseWords(String s) {
        String result = " ";
        int i = 0;
        int j = 0;
        int n = s.length();

        while (i < n) {
            while (i<n && s.charAt(i) == ' ') { //
                i++ ;
            }
            if (i>=n) {
                break;
            }
            j = i+1 ;
            while (j<n && s.charAt(j) != ' ') {
                j++ ;
            }
            String sub = s.substring(i,j);

            if (result.length() == 0) {
                result = sub ;
            } else {
                result = sub + " " + result ;
            }
            i = j+1;
        }
        return result ;
    }
}
