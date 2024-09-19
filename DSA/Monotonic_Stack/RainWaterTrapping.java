package DSA.Monotonic_Stack;

import java.util.*;

/**
 * FIND GREATEST LEFT ELEMENT ARRAY
 * FIND GREATEST RIGHT ELEMENT ARRAY
 * FIND MINIMUM OF BOTH ARRAY
 * SUBRACT IT BY THE ORIGINAL ARRAY
 * 
 * WATER[i] = MIN(MAX_LEFT,MAX_RIGHT) - arr[i];
 * 
 * SUM OF WATER ARRAY
 * AND THIS WILL BE OUR ANSWER
 */
public class RainWaterTrapping {
    public static int[] Gretest_left(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack1 = new Stack<>();
        int left[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (stack1.isEmpty()) {
                left[i] = arr[i];
            } else if (!stack1.isEmpty() && stack1.peek() > arr[i]) {
                left[i] = stack1.peek();
            } else if (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                    stack1.pop();
                }
                if (stack1.isEmpty()) {
                    left[i] = arr[i];
                } else {
                    left[i] = arr[i];
                }
            }
            if (stack1.isEmpty()) {
                stack1.push(arr[i]);
            } else if (stack1.peek() > arr[i]) {

            } else {
                stack1.push(arr[i]);
            }
        }
        return left;
    }

    public static int[] Gretest_Right(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack1 = new Stack<>();
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (stack1.isEmpty()) {
                right[i] = arr[i];
            } else if (!stack1.isEmpty() && stack1.peek() > arr[i]) {
                right[i] = stack1.peek();
            } else if (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek() <= arr[i]) {
                    stack1.pop();
                }
                if (stack1.isEmpty()) {
                    right[i] = arr[i];
                } else {
                    right[i] = stack1.peek();
                }
            }
            if (stack1.isEmpty()) {
                stack1.push(arr[i]);
            } else if (stack1.peek() > arr[i]) {

            } else {
                stack1.push(arr[i]);
            }

        }
        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;

        int[] left = Gretest_left(arr);

        int[] right = Gretest_Right(arr);

        int[] minn = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            minn[i] = Math.min(left[i], right[i]);
            minn[i] = minn[i] - arr[i];
            sum += minn[i];
        }
        System.out.println(sum);

    }
}
