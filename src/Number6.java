import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



import static java.lang.System.in;

public class Number6 {
    public static void main(String[] args) {
        random();
    }

    public static void random() {


        String[] words = new String[]{"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        System.out.println(Arrays.toString(words) + "\nугадай какое слово напишет");
        Random random = new Random();
        int index = random.nextInt(words.length);
        String word = words[index];

        Scanner sc = new Scanner(in);
        boolean done = false;
        while (!done) {
            String a = sc.next();


            if (word.equals(a)) {
                System.out.println("вы угадали");
                done = true;
            } else {
                String good = "";

                for (int i=0;i<Math.min(word.length(),a.length());i++) {
                    if (word.charAt(i) == a.charAt(i)) {
                        good += word.charAt(i);
                    }
                }
                if (good.length() == 0) {
                    good += word.charAt(0);
                }
                for(int i = good.length(); i<word.length();i++){
                    good += "#";
                }
                System.out.println("Tip:'" + good +"'");
            }
        }

    }
}
