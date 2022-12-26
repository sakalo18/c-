
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String source = sc.next();
        String target = sc.next();
        source.replace(target, source);

        if (Objects.equals(target, source)) {


            System.out.print(target.indexOf(0));
        } else
        System.out.print(source.indexOf(-1));
        }
    }

