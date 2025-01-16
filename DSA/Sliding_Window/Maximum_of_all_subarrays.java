package DSA.Sliding_Window;

import java.util.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Maximum_of_all_subarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 0, -2, -9, -9, 2, 8, 7, 5, 6, 9, 87, 5 };
        int n = arr.length;
        int k = 3;// size of window

        int i = 0;
        int j = 0;
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> li = new ArrayList<>();

        while (j < arr.length) {
            // Remove indices of smaller elements from the back of the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[j]) {
                deque.pollLast();
            }

            // Add current index to the deque
            deque.addLast(j);

            // If the window size is reached
            if (j - i + 1 == k) {
                // Add the maximum (front of deque) to the result
                li.add(arr[deque.peek()]);

                // Remove the element going out of the window
                if (!deque.isEmpty() && deque.peek() == i) {
                    deque.pop();
                }

                // Move the start pointer
                i++;
            }

            // Move the end pointer
            j++;
        }

        for (int f : li) {
            System.out.println(f);
        }

    }

}
