package DSA.Sliding_Window;

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3; // Target number of unique characters
        int n = s.length();

        int i = 0, j = 0; // Start and end of the window
        int maxLength = 0;

        // HashMap to store the frequency of characters in the current window
        HashMap<Character, Integer> charCount = new HashMap<>();

        while (j < n) {
            // Add the current character to the hashmap
            char currentChar = s.charAt(j);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            // Check if the number of unique characters exceeds k
            while (charCount.size() > k) {
                char leftChar = s.charAt(i);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar); // Remove the character from the map
                }
                i++; // Shrink the window
            }

            // If the number of unique characters is exactly k, update maxLength
            if (charCount.size() == k) {
                maxLength = Math.max(maxLength, j - i + 1);
            }

            // Expand the window
            j++;
        }

        System.out.println("The length of the longest substring with " + k + " unique characters is: " + maxLength);
    }
}
