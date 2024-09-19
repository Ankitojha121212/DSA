package DSA.Monotonic_Stack;

import java.util.Stack;

// NEXT GREATER ELEMENT TO RIGHT

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 42, 4, 2, 5, 32, 0, 0, 0, 43, 2, 22, 3 };

        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack1 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack1.isEmpty()) {
                nge[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek() > arr[i]) {
                nge[i] = stack1.peek();
            } else if (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = stack1.peek();
                }
            }

            stack1.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }
}
