package pratice.algorithms.sorting.BubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSortItOut {

    private static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void bubbleSort(int A[], int B[], int M) {
        boolean swapped = false;
        for (int i = 0; i < M - 1; i++) {
            swapped = false;
            for (int j = 0; j < M - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                    swap(B, j, j + 1);
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

        int M = Integer.parseInt(br.readLine());
        String line[] = br.readLine().split("\\s");
        int A[] = new int[M];
        int B[] = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = Integer.parseInt(line[i]);
            B[i] = i;
        }

        // Bubble sort
        bubbleSort(A, B, M);
        for (int item: B){
            System.out.print(item + " ");
        }

        br.close();
    }

}