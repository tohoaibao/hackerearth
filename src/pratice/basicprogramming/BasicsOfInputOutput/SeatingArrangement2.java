package pratice.basicprogramming.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            // Calculate the facing seat-number
            int seatFacing = N + 2*(6 - (N - 1) % 12) - 1;

            //Check the type of a seat
            if (N%6 < 2) {
                System.out.println(String.format("%d WS", seatFacing));
            } else if (N%6 == 2 || N%6 == 5) {
                System.out.println(String.format("%d MS", seatFacing));
            } else {
                System.out.println(String.format("%d AS", seatFacing));
            }

        }

        br.close();
    }

}