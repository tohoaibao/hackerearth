package pratice.datastructures.stacks;

import java.util.Scanner;

public class AGameOfNumbersLoop {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long A[] = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        boolean noGreater = true;
        boolean noSmaller = true;
        for (int i = 0; i < N; i++) {
            noGreater = true;
            noSmaller = true;
            //Next Greater
            for (int j = i + 1; j < N; j++) {
                if (A[j] > A[i]) {
                    // Find right smaller
                    noGreater = false;
                    for (int k = j + 1; k < N; k++) {
                        if (A[k] < A[j]) {
                            noSmaller = false;
                            System.out.print(A[k] + " ");
                            break;
                        }
                    }
                    break;
                }
            }
            if (noSmaller || noGreater) {
                System.out.printf("-1 ");
            }
        }

    }

}