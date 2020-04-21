package pratice.datastructures.hashtables;

import java.io.IOException;
import java.util.Scanner;

public class MaximumOccurrence {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int length = S.length();
        int hash[] = new int[256];
        char A[] = S.toCharArray();
        for (int i = 0; i < length; i++) {
            hash[A[i]]++;
        }

        int max = 0;
        for (int i = 1; i < 256; i++) {
            if (hash[i] > hash[max]) {
                max = i;
            }
        }
        System.out.println((char)max + " " + hash[max]);
    }

}