package pratice.datastructures.arrays.onedimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class PairsHavingSimilarElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        long out_ = SimilarElementsPairs(A,N);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long SimilarElementsPairs(int[] A,int N){
        Arrays.sort(A);
        long count = 0, equal = 0, noOfSimilarPairs = 0;
        for (int i = 0; i < N; i++) {
            if (i < N - 1 && (A[i] == A[i + 1] || A[i] + 1 == A[i + 1])) {
                count++;
                if (A[i] == A[i+1]) {
                    equal++;
                }
            } else if (equal == count) {
                count = 0;
                equal = 0;
            } else {
                noOfSimilarPairs += ((count + 1)*count)/2;
                count = 0;
                equal = 0;
            }
        }
        return noOfSimilarPairs;
    }
}