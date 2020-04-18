package pratice.algorithms.searching.LinearSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialShop {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String line[] = br.readLine().split("\\s+");
            int N = Integer.parseInt(line[0]);
            int A = Integer.parseInt(line[1]);
            int B = Integer.parseInt(line[2]);

            double d = (double)B*N/(A + B);
            long x = Math.round(d);
            long y = N - x;
            long minCost = A*x*x + B*y*y;

            System.out.println(minCost);
        }
        br.close();
    }

}