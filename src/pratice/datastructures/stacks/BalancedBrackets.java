package pratice.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    private static boolean isBalance(char S[]) {

        Stack<Character> stack = new Stack<>();
        int size = S.length;
        for (int i = 0; i < size; i++) {
            char c = S[i];
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char top;
            switch (c) {
                case ')':
                    top = stack.pop();
                    if (top == '{' || top == '[') {
                        return false;
                    }
                    break;
                case ']':
                    top = stack.pop();
                    if (top == '(' || top == '{') {
                        return false;
                    }
                    break;
                case '}':
                    top = stack.pop();
                    if (top == '(' || top == '[') {
                        return false;
                    }
                    break;
            }

        }

        // balance if stack empty
        return stack.isEmpty();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String A[] = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
            System.out.println(isBalance(A[i].toCharArray())?"YES":"NO");
        }

    }

}