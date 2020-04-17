package pratice.algorithms.sorting.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyGoing {

    private static void bubbleSort(int A[], int N){

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String line[] = br.readLine().split("\\s");
            int N = Integer.parseInt(line[0]);
            int M = Integer.parseInt(line[1]);
            int range = N - M;

            String lineArr[] = br.readLine().split("\\s");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(lineArr[i]);
            }

            // Sorted array
            bubbleSort(A, N);

            int minSum = 0;
            int maxSum = 0;

            // Find minSum
            for (int i = 0; i < range; i++) {
                minSum += A[i];
            }

            // Find maxSum
            for (int i = M; i < N; i++) {
                maxSum += A[i];
            }

            System.out.println(maxSum - minSum);
        }

        br.close();
    }

}