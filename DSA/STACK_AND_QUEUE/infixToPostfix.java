// package DSA.STACK_AND_QUEUE;

import java.util.*;

public class infixToPostfix {
    public static int priority(char s) {
        if (s == '^') {
            return 3;
        } else if (s == '/' || s == '*') {
            return 2;
        } else if (s == '+' || s == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static String inToPo(String s) {
        Stack<Character> st1 = new Stack<>();
        // int i = 0;
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ||
                    s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                    s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans.append(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                st1.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!st1.isEmpty() && st1.peek() != '(') {
                    ans.append(st1.pop());
                }
                st1.pop();
            } else {
                while (!st1.isEmpty() && priority(s.charAt(i)) <= priority(st1.peek())) {
                    ans.append(st1.pop());
                }
                st1.push(s.charAt(i));
            }

        }

        while (!st1.isEmpty()) {
            ans.append(st1.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";

        String ans = inToPo(s);
        System.out.println(ans);

    }
}
