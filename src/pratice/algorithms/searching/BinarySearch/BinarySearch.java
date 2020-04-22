package pratice.algorithms.searching.BinarySearch;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static int binarySearch(int A[], int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high)/2;
            if (A[mid] < key) {
                low = mid + 1;
            } else if (A[mid] > key) {
                high = mid - 1;
            } else {
                return mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        Arrays.sort(A);
        while (q-- > 0) {
            int x = sc.nextInt();
            System.out.println(binarySearch(A, 0, N - 1, x));
        }
    }

}