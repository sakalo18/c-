import java.util.Scanner;

import static java.lang.System.in;

public class Number2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(in);
  String str1=new String(sc.next());
  System.out.print(str1.chars().filter(c->c=='a').count());
    }
}


