package pratice.datastructures.hashtables;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class AlienLanguage {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String text = sc.next();
            String pattern = sc.next();
            HashSet<Character> hashSet = new HashSet<>();

            for (int i = 0; i < text.length(); i++) {
                hashSet.add(text.charAt(i));
            }

            boolean isSubString = false;
            for (int i = 0; i < pattern.length(); i++) {
                if (hashSet.contains(pattern.charAt(i))) {
                    isSubString = true;
                    break;
                }
            }

            System.out.println(isSubString?"YES":"NO");
        }
    }

}