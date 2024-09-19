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

public class MaximumAreaOfHistogram {

    public static int[] NextSmallerElementToLeft(int[] height) {
        int n = height.length;
        int[] nsil = new int[n];

        Stack<pair> stack1 = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (stack1.isEmpty()) {
                nsil[i] = -1;
            } else if (!stack1.isEmpty() && stack1.peek().element < height[i]) {
                nsil[i] = stack1.peek().index;
            } else if (!stack1.isEmpty() && stack1.peek().element >= height[i]) {
                while (!stack1.isEmpty() && stack1.peek().element >= height[i]) {
                    stack1.pop();
                }

                if (stack1.isEmpty()) {
                    nsil[i] = -1;
                } else {
                    nsil[i] = stack1.peek().index;
                }
            }
            stack1.push(new pair(height[i], i));

        }
        return nsil;
    }

    public static int[] NextSmallerElementToRight(int[] height) {
        int n = height.length;
        int[] nsir = new int[n];
        Stack<pair> stack1 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack1.isEmpty()) {
                nsir[i] = n;
            } else if (!stack1.isEmpty() && stack1.peek().element < height[i]) {
                nsir[i] = stack1.peek().index;
            } else if (!stack1.isEmpty() && stack1.peek().element >= height[i]) {
                while (!stack1.isEmpty() && stack1.peek().element >= height[i]) {
                    stack1.pop();

                }

                if (stack1.isEmpty()) {
                    nsir[i] = n;
                } else {
                    nsir[i] = stack1.peek().index;
                }
            }
            stack1.push(new pair(height[i], i));
        }
        return nsir;
    }

    public static void main(String[] args) {
        // 1. find the Next smaller element of left of index
        // 2. find the next smaller element of right of index
        // 3. find the width array by (right[i]-left[i])-1;
        // 4. give the area of array by Area[i] = width[i]*height[i];

        int[] height = { 6, 2, 5, 4, 5, 1, 6 };
        int n = height.length;

        int left[] = NextSmallerElementToLeft(height);
        int right[] = NextSmallerElementToRight(height);

        int[] widhth = new int[n];
        for (int i = 0; i < n; i++) {
            widhth[i] = (right[i] - left[i]) - 1;
        }
        int[] area = new int[n];
        for (int i = 0; i < n; i++) {
            area[i] = widhth[i] * height[i];
            System.out.print(area[i] + "  ");
        }

    }
}
