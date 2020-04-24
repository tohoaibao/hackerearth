package pratice.algorithms.sorting.CoutingSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

    private static void countingSort(int A[], int N) {
        // First, find the maximum value in A[]
        int K = Arrays.stream(A).max().getAsInt();

        // Initialize the elements of Aux[] with 0
        int Aux[] = new int[K + 1];
        Arrays.fill(Aux, 0);

        // Store the frequencies of each distinct element of A[],
        // by mapping its value as the index of Aux[] array
        for (int i = 0; i < N; i++) {
            Aux[A[i]]++;
        }

        int j = 0;
        for(int i=0; i<=K; i++) {
            int tmp = Aux[i];
            // Aux stores which element occurs how many times,
            // Add i in sortedA[] according to the number of times i occured in A[]
            while(tmp-- > 0) {
                A[j++] = i;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        countingSort(A, N);
        System.out.println(Arrays.toString(A));

    }
}

