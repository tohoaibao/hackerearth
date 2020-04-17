package pratice.algorithms.sorting.BubbleSort;

import java.io.IOException;
import java.util.Scanner;

public class PizzaConfusion {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String names[] = new String[N];
        int points[] = new int[N];
        for (int i = 0; i < N; i++) {
            names[i] = sc.next();
            points[i] = sc.nextInt();
        }

        // Index of max
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (points[i] > points[max]) {
                max = i;
            } else if (points[i] == points[max]) {
                if (names[i].compareTo(names[max]) < 0) {
                    max = i;
                }
            }
        }

        System.out.println(names[max]);

    }

}