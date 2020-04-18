package pratice.algorithms.searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedKTimes {

    private static int countRepeated(int A[], int index, int N) {
        int count = 1;
        for (int i = index + 1; i < N; i++) {
            if (A[i] == A[index]){
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int K = sc.nextInt();

        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            if (countRepeated(A, i, N) == K) {
                System.out.println(A[i]);
                break;
            }
        }

    }

}