package pratice.basicprogramming.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int seatNum = N % 12;
            switch (seatNum) {
                case 0:// 12, 24
                    System.out.println(String.format("%d WS", N - 11));
                    break;
                case 1:// 13, 25
                    System.out.println(String.format("%d WS", N + 11));
                    break;
                case 2:// 14, 26
                    System.out.println(String.format("%d MS", N + 9));
                    break;
                case 3:// 15, 27
                    System.out.println(String.format("%d AS", N + 7));
                    break;
                case 4:// 16, 28
                    System.out.println(String.format("%d AS", N + 5));
                    break;
                case 5:// 17, 29
                    System.out.println(String.format("%d MS", N + 3));
                    break;
                case 6:// 18, 30
                    System.out.println(String.format("%d WS", N + 1));
                    break;
                case 7:// 19, 31
                    System.out.println(String.format("%d WS", N - 1));
                    break;
                case 8:// 20, 32
                    System.out.println(String.format("%d MS", N - 3));
                    break;
                case 9:// 21, 33
                    System.out.println(String.format("%d AS", N - 5));
                    break;
                case 10:// 22, 34
                    System.out.println(String.format("%d AS", N - 7));
                    break;
                case 11:// 23, 35
                    System.out.println(String.format("%d MS", N - 9));
                    break;
            }
        }

        br.close();
    }

}