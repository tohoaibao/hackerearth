package pratice.datastructures.arrays.multidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndSymmetricLogos {

    private static boolean checkSymmetric(String A[][], int N) {

        // Check X-axis
        for (int i = 0; i < N/2; i++) {
            for (int j = 0; j < N; j++) {
                if (!A[i][j].equals(A[N - i -1][j])) {
                    return false;
                }
            }
        }

        // Check Y-axis
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N/2; j++) {
                if (!A[i][j].equals(A[i][N - j - 1])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String A[][] = new String[N][N];
            for (int i = 0; i < N; i++){
                String arr[] = br.readLine().split("");
                for (int j = 0; j < N; j++) {
                    A[i][j] = arr[j];
                }
            }
            System.out.println(checkSymmetric(A, N)?"YES":"NO");
        }

        br.close();
    }

}