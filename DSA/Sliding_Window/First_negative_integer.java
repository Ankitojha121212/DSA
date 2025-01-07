package DSA.Sliding_Window;

import java.util.*;
import java.util.ArrayList;

public class First_negative_integer {
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = arr.length;
        int k = 3;// size of window
        int[] ans = new int[n - k + 1];

        int i = 0;
        int j = 0;
        List<Integer> li = new ArrayList<>();
        int count = 0;

        while (j < n) {
            if (arr[j] < 0) {
                li.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (li.isEmpty()) {
                    ans[count] = 0;
                } else {
                    ans[count] = li.get(0);

                    if (li.getFirst() == arr[i]) {
                        li.remove(0);
                    }
                }
                i++;
                j++;
                count++;
            }
        }

        for (int f = 0; f < ans.length; f++) {
            System.out.println(ans[f]);
        }
    }
}
