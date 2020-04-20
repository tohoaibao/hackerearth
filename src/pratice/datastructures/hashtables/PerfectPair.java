package pratice.datastructures.hashtables;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PerfectPair {

    private static boolean isSquare(int x) {
        int y = (int)Math.sqrt(x);
        return y*y == x;
    }

    private static boolean isCube(int x) {
        int y = (int)Math.cbrt(x);
        return y*y*y == x;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0){
            int N = sc.nextInt();

            int A[] = new int[N];
            int hash[] = new int [1005];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                hash[A[i]]++;
            }

            Arrays.sort(A);

            int count = 0;
            for (int i = 1; i <= A[N - 1]; i++) {
                if (hash[i] >= 1) {
                    if (isSquare(2*i) || isCube(2*i)) {
                        count = count + (hash[i]*(hash[i] - 1))/2;
                    }
                    for (int j = i + 1; j <= A[N - 1]; j++) {
                        if (hash[i] > 0) {
                            if (isSquare(i + j) || isCube(i + j)) {
                                count = count + hash[i]*hash[j];
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

}