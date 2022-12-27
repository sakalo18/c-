import java.util.Scanner;

import static java.lang.System.in;

public class Number4 {
    public static void  stringReverse(){
        Scanner sc = new Scanner(in);
        String stringExample = sc.next();

        StringBuilder reverseString = new StringBuilder(stringExample);
        reverseString.reverse();
        System.out.println(reverseString);


    }

}
