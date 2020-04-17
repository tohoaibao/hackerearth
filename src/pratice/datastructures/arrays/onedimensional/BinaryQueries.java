package pratice.datastructures.arrays.onedimensional;

import java.io.IOException;
import java.util.Scanner;

public class BinaryQueries {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        while (Q-- > 0) {
            int qType = sc.nextInt();
            switch (qType) {
                case 1:
                    int index = sc.nextInt() - 1;
                    arr[index] = 1 - arr[index];
                    break;
                case 0:
                    int L = sc.nextInt() - 1;
                    int R = sc.nextInt() - 1;
                    System.out.println((arr[R]==0)?"EVEN":"ODD");
                    break;
            }
        }

    }

}