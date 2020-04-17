package pratice.basicprogramming.BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int length = S.length();
        int numberZ = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'z') {
                numberZ++;
            } else {
                break;
            }
        }

        System.out.println(numberZ*2 == (length - numberZ) ? "Yes": "No");

        br.close();
    }

}