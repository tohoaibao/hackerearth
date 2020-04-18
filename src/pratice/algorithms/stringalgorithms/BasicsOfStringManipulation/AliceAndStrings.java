package pratice.algorithms.stringalgorithms.BasicsOfStringManipulation;

import java.util.Scanner;

public class AliceAndStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        char[] charArrayA = A.toCharArray();
        char[] charArrayB = B.toCharArray();

        int max = charArrayB[0] - charArrayA[0];

        if (max > 0) {
            for (int i = 1; i < charArrayA.length; i++) {
                int diff = charArrayB[i] - charArrayA[i];
                if (diff > max) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}