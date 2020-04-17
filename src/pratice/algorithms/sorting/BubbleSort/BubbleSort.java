package pratice.algorithms.sorting.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    // An optimized version of Bubble Sort
    private static void bubbleSort(int A[], int N){
        boolean swapped = false;
        for (int i = 0; i < N - 1; i++) {
            swapped = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String line[] = br.readLine().split("\\s");
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(line[i]);
        }

        bubbleSort(A, N);

        for (int item: A) {
            System.out.print(item + " ");
        }

        br.close();
    }

}