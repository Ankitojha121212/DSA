package DSA.Sliding_Window;

import java.util.HashMap;

public class Count_occurance_of_anogram {
    public static void main(String[] args) {
        String str = "aabaabaa";
        String ptr = "aaba";
        int n = str.length();
        int k = ptr.length();

        HashMap<Character, Integer> map = new HashMap<>();

        // Create a frequency map for the pattern
        for (char ch : ptr.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size(); // Count of unique characters to match
        int i = 0, j = 0, anagramCount = 0;

        while (j < n) {
            // Decrease the frequency of the current character in the map
            char current = str.charAt(j);
            if (map.containsKey(current)) {
                map.put(current, map.get(current) - 1);
                if (map.get(current) == 0) {
                    count--; // Match found for one character
                }
            }

            // Expand the window
            if (j - i + 1 < k) {
                j++;
            }
            // When window size matches `k`
            else if (j - i + 1 == k) {
                // If all characters match, it's an anagram
                if (count == 0) {
                    anagramCount++;
                }

                // Slide the window
                char start = str.charAt(i);
                if (map.containsKey(start)) {
                    map.put(start, map.get(start) + 1);
                    if (map.get(start) == 1) {
                        count++; // A previously matched character is unmatched
                    }
                }
                i++;
                j++;
            }
        }

        System.out.println("Number of anagrams: " + anagramCount);
    }
}
