package DSA.Monotonic_Stack;

import java.util.*;

class pair {
    int element;
    int index;

    pair(int element, int index) {
        this.element = element;
        this.index = index;
    }
}

public class MaximumAreaOfBinary2DMatrix {
    public static int[] NextSmallerElementLeft(int[] heights) {
        int n = heights.length;
        Stack<pair> stack1 = new Stack<>();
        int[] nsil = new int[n];
        for (int i = 0; i < n; i++) {
            if (stack1.isEmpty()) {
                nsil[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek().element < heights[i]) {
                nsil[i] = stack1.peek().index;
            } else if (!stack1.isEmpty() && stack1.peek().element >= heights[i]) {
                while (!stack1.isEmpty() && stack1.peek().element >= heights[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    nsil[i] = -1;
                } else {
                    nsil[i] = stack1.peek().index;
                }
            }
            stack1.push(new pair(heights[i], i));
        }
        return nsil;
    }

    public static int[] NextSmallerElementRight(int[] heights) {
        int n = heights.length;
        Stack<pair> stack1 = new Stack<>();
        int[] nsir = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (stack1.isEmpty()) {
                nsir[i] = n;
            } else if (!stack1.isEmpty() && stack1.peek().element < heights[i]) {
                nsir[i] = stack1.peek().index;
            } else if (!stack1.isEmpty() && stack1.peek().element >= heights[i]) {
                while (!stack1.isEmpty() && stack1.peek().element >= heights[i]) {
                    stack1.pop();
                }
                if (stack1.isEmpty()) {
                    nsir[i] = n;
                } else {
                    nsir[i] = stack1.peek().index;
                }
            }
            stack1.push(new pair(heights[i], i));
        }
        return nsir;
    }

    public static int MaximumAreaOfHistogram(int[] heights) {
        int n = heights.length;

        int left[] = NextSmallerElementLeft(heights);
        int right[] = NextSmallerElementRight(heights);

        int[] width = new int[n];
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            width[i] = (right[i] - left[i]) - 1;
            width[i] = width[i] * heights[i];
            maxi = Math.max(maxi, width[i]);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };

        int n = arr.length;
        int m = arr[0].length;
        int maxi = -1;

        int[] ans = new int[m];

        // Adding first row
        for (int j = 0; j < m; j++) {
            ans[j] = arr[0][j];
        }
        maxi = Math.max(maxi, MaximumAreaOfHistogram(ans));

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    ans[j] = 0;
                } else {
                    ans[j] = ans[j] + arr[i][j];
                }
            }
            maxi = Math.max(maxi, MaximumAreaOfHistogram(ans));
        }
        System.out.println(maxi);
    }
}
