// package DSA.STACK_AND_QUEUE;

import java.util.*;

/***
 * The intution of that is
 * '(' + top2 + ch + top1 + ')';
 * 
 * 
 */
public class postfixToInfix {

    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        int n = s.length();
        Stack<String> stack1 = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z' ||
                    ch >= 'a' && ch <= 'z' ||
                    ch >= '0' && ch <= '9') {
                stack1.push(Character.toString(ch));
            } else {
                String top1 = stack1.pop();
                String top2 = stack1.pop();

                String out = '(' + top2 + ch + top1 + ')';
                stack1.push(out);
            }
        }
        System.out.println(stack1.peek());
    }
}
