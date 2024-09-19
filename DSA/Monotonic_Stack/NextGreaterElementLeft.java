package DSA.Monotonic_Stack;

import java.util.*;

// For that Question just change the direction of loop 
public class NextGreaterElementLeft {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 32, 3, 3, 4, 4, 55, 5, 55, 3, 3, 3, 455, 3 };

        int n = arr.length;
        Stack<Integer> stack1 = new Stack<>();
        int[] ngel = new int[n];
        for (int i = 0; i < n; i++) {

            if (stack1.isEmpty()) {
                ngel[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek() > arr[i]) {
                ngel[i] = stack1.peek();
            } else if (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    ngel[i] = -1;
                } else {
                    ngel[i] = stack1.peek();
                }
            }
            stack1.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ngel[i] + " ");
        }
    }
}
