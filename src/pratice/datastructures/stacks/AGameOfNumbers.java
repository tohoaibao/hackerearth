package pratice.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class AGameOfNumbers {

    // Find the next smaller of next greater element of every element in array.
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long A[] = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        // Find next greater element
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[N];
        for (int i = N - 1; i >= 0; i--) {

            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                nextGreater[i] = stack.peek();
            } else {
                nextGreater[i] = -1;
            }

            stack.push(i);
        }

        // Find right smaller element
        stack = new Stack<>();
        int rightSmaller[] = new int[N];
        for (int i = N - 1; i >= 0; i--) {

            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                rightSmaller[i] = stack.peek();
            } else {
                rightSmaller[i] = -1;
            }

            stack.push(i);
        }

        for (int i = 0; i < N; i++) {
            if (nextGreater[i] != -1 && rightSmaller[nextGreater[i]] != -1) {
                System.out.printf(A[rightSmaller[nextGreater[i]]] + " ");
            } else {
                System.out.printf("-1 ");
            }
        }

    }

}