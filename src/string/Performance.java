package string;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char x = (char) ('a' + i);
            System.out.println(x);
            series += x ;
        }
        // converted it to the string
        System.out.println(series);
/*
every time we are adding char to series it is pointing to the new object again and again so to
solve this issue we will use String Builder
 */
    }
}
