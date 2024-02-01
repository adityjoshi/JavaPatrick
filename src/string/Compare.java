package string;

public class Compare {
    public static void main(String[] args) {
        String a = "xi";
        String b = new String("xi");
        System.out.println(a==b);
// it will give false because it checks weather the variable is pointing to the same object
        System.out.println(a.equals(b));
// it checks the object value rather than checking if the variable is pointing to the same object
        char x = a.charAt(0);
        System.out.println(x);
    }
}
