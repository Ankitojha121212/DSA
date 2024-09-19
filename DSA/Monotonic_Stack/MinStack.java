package DSA.Monotonic_Stack;

import java.util.*;

public class MinStack {
    public static Stack<Integer> s = new Stack<>();
    public static Stack<Integer> ss = new Stack<>();

    public static void pushh(int data) {
        if (s.isEmpty()) {
            s.push(data);
            ss.push(data);
        } else if (data <= ss.peek()) {
            s.push(data);
            ss.push(data);
        } else {
            s.push(data);
        }
    }

    public static int popp() {
        int a;
        if (s.peek() == ss.peek()) {
            a = s.pop();
            ss.pop();
        } else {
            a = s.pop();
        }
        return a;
    }

    public static void minStack() {
        if (ss.isEmpty()) {
            System.out.println("empty");
        } else
            System.out.println(ss.peek());
    }

    public static void main(String[] args) {
        int[] arr = { 18, 19, 15, 23, 21, 33, 44 };
        pushh(arr[0]);
        pushh(arr[1]);
        pushh(arr[2]);

        minStack();
        System.out.println(popp());
        minStack();
        // arr.push(29);
        // arr.push(15);
        // minStack();
        // arr.push(17);
        // minStack();
        // arr.pop();
        // arr.pop();
        // minStack();
        // arr.pop();
        // minStack();

    }
}
