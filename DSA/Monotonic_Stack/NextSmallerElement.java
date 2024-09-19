package DSA.Monotonic_Stack;

import java.util.*;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 344, 44, 32, 2, 1, 4, 5, 222, 4, 4, 5, 333, 5, 5, 36, 76, 6, 1, 7 };
        int n = arr.length;

        int[] nse = new int[n];
        Stack<Integer> stack1 = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            if (stack1.isEmpty()) {
                nse[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek() < arr[i]) {
                nse[i] = stack1.peek();
            } else if (!stack1.isEmpty() && stack1.peek() >= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek() >= arr[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    nse[i] = -1;
                } else {
                    nse[i] = stack1.peek();
                }
            }
            stack1.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nse[i] + " ");
        }
    }
}
