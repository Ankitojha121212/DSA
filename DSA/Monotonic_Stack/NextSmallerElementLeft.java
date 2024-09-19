package DSA.Monotonic_Stack;

import java.util.Stack;

public class NextSmallerElementLeft {
    public static void main(String[] args) {
        int[] arr = { 23, 4, 5, 5, 3, 33, 8, 899, 3, 34, 1 };
        int n = arr.length;

        int[] nsel = new int[n];
        Stack<Integer> stack1 = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (stack1.isEmpty()) {
                nsel[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek() < arr[i]) {
                nsel[i] = stack1.peek();
            } else if (!stack1.isEmpty() && stack1.peek() >= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek() >= arr[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    nsel[i] = -1;
                } else {
                    nsel[i] = stack1.peek();
                }
            }
            stack1.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nsel[i] + " ");
        }
    }
}
