package pratice.algorithms.searching.LinearSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialShop2 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String line[] = br.readLine().split("\\s+");
            int N = Integer.parseInt(line[0]);
            int A = Integer.parseInt(line[1]);
            int B = Integer.parseInt(line[2]);

            int minCost = Integer.MAX_VALUE;
            for (int x = 0; x <= N; x++) {
                int y = N - x;
                int cost = A*x*x + B*y*y;
                if (cost < minCost) {
                    minCost = cost;
                }
            }
            System.out.println(minCost);
        }
        br.close();
    }

}