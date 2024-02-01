package string;

public class Main {
    public static void main(String[] args) {
        String name = "adi";
        System.out.println(name);
        name = "joshi";
        System.out.println(name);
/* so what actually is happening above is the name variable is now pointing to joshi
   instead of pointing it to adi. Now adi will go to garbage collection.
 */

    }
}
