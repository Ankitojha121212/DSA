// package DSA.STACK_AND_QUEUE;

import java.util.*;

public class infixToPrefix {
    public static String inToPost(String s) {
        int n = s.length();
        Stack<Character> stack1 = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' ||
                    ch >= 'a' && ch <= 'z' ||
                    ch >= '0' && ch <= '9') {
                ans.append(ch);
            } else if (ch == '(') {
                stack1.push(ch);
            } else if (ch == ')') {
                while (!stack1.isEmpty() && stack1.peek() != '(') {
                    ans.append(stack1.pop());
                }
                if (stack1.peek() == '(') {
                    stack1.pop();
                }
            } else {
                while (!stack1.isEmpty() && priority(ch) < priority(stack1.peek())) {
                    ans.append(stack1.pop());
                }
                stack1.push(ch);
            }
        }
        while (!stack1.isEmpty()) {
            ans.append(stack1.pop());
        }
        return ans.toString();
    }

    public static int priority(char x) {
        if (x == '^') {
            return 3;
        } else if (x == '/' || x == '*') {
            return 2;
        } else if (x == '+' || x == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static String reverse(String s) {
        StringBuilder sp = new StringBuilder(s);
        int start = 0;
        int n = s.length();
        int end = n - 1;

        while (start < end) {
            char temp = sp.charAt(start);
            sp.setCharAt(start, sp.charAt(end)); // sp.charAt(start) = sp.charAt(end);
            sp.setCharAt(end, temp); // sp.charAt(end) = temp;
            start++;
            end--;
        }
        return sp.toString();
    }

    public static String reverseWithBracket(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')') {
                ans.append('(');
            } else if (ch == '(') {
                ans.append(')');
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static String intoPre(String s) {
        // 1. Reverse the string
        // 2. convert it into infix to postfix
        // 3. reverse it and return it

        String reversed = reverseWithBracket(s);
        String posrfix = inToPost(reversed);
        return reverse(posrfix);
    }

    public static void main(String[] args) {
        String s = "(a+b)*c-d+f";
        String ans = intoPre(s);
        System.out.println(ans);
    }
}

/**
 * for solving that Infix to Prefix
 * 3 Step's
 * 
 * #1. Reverse the given String and convert the breakts from ( => to ) and vice
 * versa
 * #2. Convert the reversed String into infix to postfix conversion (if the
 * incoming operator is equal priority then put into the stack)
 * #3. Reverse the last String
 */