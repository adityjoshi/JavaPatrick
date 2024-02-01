package string;

public class Sb {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder();
        for(int i = 0 ; i<26; i++) {
            char y = (char)('a'+ i) ;
            x = x.append(y);
        }
        System.out.println(x);
    }
}
