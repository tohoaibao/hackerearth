package pratice.basicprogramming.Implementation;

import java.util.Scanner;

public class DigitProblem {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String X = sc.next();
        int K = sc.nextInt();
        int N = X.length();
        StringBuilder str = new StringBuilder(X);
        for (int i = 0; i < K && i < N; i++) {
            if (str.charAt(i) != '9') {
                str.setCharAt(i, '9');
            } else {
                K++;
            }
        }

        System.out.println(str);

    }
}

