package pratice.basicprogramming;

import java.util.Scanner;

public class VowelRecognition {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T--  > 0) {
            String S = sc.next();
            char A[] = S.toLowerCase().toCharArray();
            int n = A.length;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                char c = A[i];
                if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i') {
                    long magic_number = n - i;
                    sum += magic_number*(i + 1);
                }
            }
            System.out.println(sum);
        }
    }
}

