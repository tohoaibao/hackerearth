package pratice.datastructures.arrays.onedimensional;

import java.util.Arrays;
import java.util.Scanner;

public class MicroAndArrayUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            // Find min value
            int minValue = Arrays.stream(arr).min().getAsInt();
            int diff = K - minValue;
            System.out.println(diff > 0 ? diff : 0);
        }
    }

}