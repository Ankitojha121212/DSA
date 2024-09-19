package DSA.Monotonic_Stack;

import java.util.Stack;

class pair {
    int element;
    int index;

    pair(int element, int index) {
        this.element = element;
        this.index = index;
    }
}

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 80, 85 };
        int n = arr.length;

        Stack<pair> stack1 = new Stack<>();

        int[] ngel = new int[n];

        for (int i = 0; i < n; i++) {

            if (stack1.isEmpty()) {
                ngel[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek().element > arr[i]) {
                ngel[i] = stack1.peek().index;
            } else if (!stack1.isEmpty() && stack1.peek().element <= arr[i]) {
                while (!stack1.isEmpty() && stack1.peek().element <= arr[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    ngel[i] = -1;
                } else {
                    ngel[i] = stack1.peek().index;
                }
            }

            stack1.push(new pair(arr[i], i));
        }

        // Now we have the index array of next greater index
        // int[] ans = new int[n]; we can also store the ans array in same array so
        // thats how we can save our space complexity by O(n)
        for (int i = 0; i < n; i++) {
            ngel[i] = i - ngel[i];
            System.out.print(ngel[i] + "  ");
        }

    }
}