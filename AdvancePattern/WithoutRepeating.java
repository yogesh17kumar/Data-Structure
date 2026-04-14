package AdvancePattern;

import java.util.*;

public class WithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        Set<Character> set = new HashSet<>();

        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If duplicate found → shrink window
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(ch);

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Longest substring length: " + maxLen);
        sc.close();
    }
}