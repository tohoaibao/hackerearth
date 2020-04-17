package pratice.datastructures.arrays.multidimensional;

import java.util.Scanner;

public class MonkAndOperations {

    private static long sumByRow(long A[][], int B[], int N, int M) {
        long max1, max2, max3;
        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            max1 = 0;
            max2 = 0;
            max3 = 0;
            for (int j = 0; j < M; j++) {
                max1 += Math.abs(A[i][j] + B[0]);
                max2 += Math.abs(B[1]);
                max3 += Math.abs(A[i][j]);
            }
            totalSum += findMax(max1, max2, max3);
        }

        return totalSum;
    }

    private static long sumByColumn(long A[][], int B[], int N, int M) {
        long max1, max2, max3;
        long totalSum = 0;
        for (int i = 0; i < M; i++) {
            max1 = 0;
            max2 = 0;
            max3 = 0;
            for (int j = 0; j < N; j++) {
                max1 += Math.abs(A[j][i] + B[2]);
                max2 += Math.abs(B[3]);
                max3 += Math.abs(A[j][i]);
            }

            totalSum += findMax(max1, max2, max3);
        }

        return totalSum;
    }

    private static long findMax(long a, long b, long c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long A[][] = new long[N][M];
        int B[] = new int[4];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextLong();
            }
        }

        for (int i = 0; i < 4; i++) {
            B[i] = sc.nextInt();
        }

        // Sum by row - v1, v2
        long sumByRow = sumByRow(A, B, N, M);

        // Sum by column - v3, v4
        long sumByColumn = sumByColumn(A, B, N, M);

        System.out.println(sumByRow > sumByColumn ? sumByRow : sumByColumn);

    }

}