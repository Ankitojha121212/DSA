package DSA.Monotonic_Stack;

import java.util.Stack;

public class MinStackUsingVariable {
    static Stack<Integer> stack1 = new Stack<>();
    static int minElement;

    void getMin() {
        System.out.println(minElement);
    }

    public static void push(int data) {
        if (stack1.isEmpty()) {
            stack1.push(data);
            minElement = data;
        } else {
            if (minElement <= data) {
                stack1.push(data);
            } else {
                stack1.push(2 * data - minElement);
                minElement = data;
            }
        }
    }

    public static int pop() {
        if (stack1.isEmpty()) {
            return -1;
        } else {
            if (stack1.peek() < minElement) {
                int a = minElement;
                minElement = 2 * minElement - stack1.peek();
                stack1.pop();
                return a;
            } else {
                return stack1.pop();
            }
        }
    }

    public int top() {
        if (stack1.isEmpty()) {
            return -1;
        } else {
            if (stack1.peek() < minElement) {
                return minElement;
            } else {
                return stack1.peek();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 18, 19, 15, 23, 21, 33, 44 };
        push(arr[0]);
        push(arr[1]);
        push(arr[2]);

        System.out.println(minElement);
        System.out.println(pop());
        System.out.println(minElement);
    }

}
