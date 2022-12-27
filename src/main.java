import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("задание 2\n ");
        String str1=sc.next();
        System.out.println(Number2.findSymbolOccurance(str1));
        System.out.println("\n");
        System.out.println("задание 3\n");
        String source = sc.next();
        String target = sc.next();
        System.out.println(Number3.findWordPosition(source,target)? " 0": " -1");


        System.out.println("\n");
        System.out.println("задание 4\n");
        String stringExample=sc.next();
        System.out.println(Number4.stringReverse(stringExample));
        System.out.println("\n");
        System.out.println("задание 5\n");
        String str = sc.next();
        System.out.println(Number5.isPalindrome(str) ? " true": " false");


        System.out.println("\n");
    }
}
