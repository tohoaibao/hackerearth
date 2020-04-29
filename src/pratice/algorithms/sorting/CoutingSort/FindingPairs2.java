package pratice.algorithms.sorting.CoutingSort;

import java.util.Arrays;
import java.util.Scanner;

public class FindingPairs2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A[] = new int[N + 1];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A, 0, N);
            int ctr = 1;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == A[i + 1]) {
                    ctr++;
                } else {
                    sum += ctr * (ctr + 1)/2;
                    ctr = 1;
                }
            }
            System.out.println(sum);
        }
    }
}

