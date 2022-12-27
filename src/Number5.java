import java.util.Scanner;

import static java.lang.System.in;

public class Number5 {
    public static boolean  isPalindrome(String str){
            String reverseStr = "";
            for (int i = str.length(); i > 0; i--) {
                reverseStr += str.charAt(i-1);
            }
            return str.equalsIgnoreCase(reverseStr);
        }
    }