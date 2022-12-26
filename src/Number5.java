import java.util.Scanner;

import static java.lang.System.in;

public class Number5 {
    public static void main(String[] args) {
             boolean a=true;
             boolean b=false;
        Scanner sc = new Scanner(in);
            String str = sc.next(), reverseStr = "";

            int strLength = str.length();

            for (int i = (strLength - 1); i >= 0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " \n"+a);
            } else {
                System.out.println(str + " \n"+b);
            }
        }
    }