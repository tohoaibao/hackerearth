package pratice.algorithms.sorting.QuickSort;

import java.util.Scanner;

public class PromNight {

    private static void swap(int A[], int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    private static int partition(int A[], int start, int end) {

        int i = start + 1;
        int piv = A[start];
        for (int j = start + 1; j <= end; j++) {
            if (A[j] < piv) {
                swap(A, i, j);
                i++;
            }
        }
        swap(A, start, i - 1);

        return i - 1;
    }

    private static void quickSort(int A[], int start, int end) {
        if (start < end) {
            int piv_pos = partition(A, start, end);
            quickSort(A, start, piv_pos - 1);
            quickSort(A, piv_pos + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int boys[] = new int[M];
            int girls[] = new int[N];
            for (int i = 0; i < M; i++) {
                boys[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                girls[i] = sc.nextInt();
            }

            quickSort(boys, 0, M - 1);
            quickSort(girls, 0, N - 1);

            boolean check = true;
            int min = M < N ? M:N;
            for (int i = 0; i < min; i++) {
                if (boys[i] <= girls[i]) {
                    check = false;
                    break;
                }
            }
            System.out.println(check?"YES":"NO");
        }

    }
}

