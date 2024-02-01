package string;

import java.util.Arrays;

public class PrintStream {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4};
        System.out.println(arr);
// when we directly call arr it will not show the result cause java doesn't know what's the type of object
        System.out.println(Arrays.toString(arr));
// this will covert the array to string
    }
}
