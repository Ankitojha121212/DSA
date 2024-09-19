// package DSA.STACK_AND_QUEUE;

import java.util.*;

public class postfixToPrefix {
    public static void main(String[] args) {
        Stack<String> stack2 = new Stack<>();
        String s = "AB-DE+F*/";
        int i = 0;
        int n = s.length();
        while (i < n) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z' ||
                    ch >= 'a' && ch <= 'z' ||
                    ch >= '0' && ch <= '9') {
                stack2.push(Character.toString(ch));
            } else {
                String top1 = stack2.pop();
                String top2 = stack2.pop();

                String out = ch + top2 + top1;
                stack2.push(out);
            }
            i++;
        }
        System.out.println(stack2.peek());
    }
}
