package pratice.algorithms.sorting.CoutingSort;

import java.util.Scanner;

public class FindingPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        final int MAX_SIZE = 1000000;
        while (T-- > 0) {
            int N = sc.nextInt();
            int count[] = new int[2*MAX_SIZE + 1];
            int temp;
            for (int i = 0; i < N; i++) {
                temp = sc.nextInt();
                if (count[temp + MAX_SIZE] == 0) {
                    count[temp + MAX_SIZE] = 2;
                } else {
                    count[temp + MAX_SIZE]++;
                }
            }

            int answer = 0;
            for (int i = 0; i < 2*MAX_SIZE + 1; i++) {
                answer += (count[i]*(count[i]-1))/2;
            }

            System.out.println(answer);
        }


    }
}

