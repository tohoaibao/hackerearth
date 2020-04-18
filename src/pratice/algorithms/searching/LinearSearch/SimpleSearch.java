package pratice.algorithms.searching.LinearSearch;

import java.util.Scanner;

public class SimpleSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int K = sc.nextInt();

        int index = -1;
        for (int i = 0; i < N; i++) {
            if (A[i] == K) {
                index = i;
                break;
            }
        }

        System.out.println(index);

    }

}