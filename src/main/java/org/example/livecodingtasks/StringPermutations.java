package org.example.livecodingtasks;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        List<String> words = generatePermutations(remainingStr);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newPermutation = word.substring(0, i) + firstChar + word.substring(i);
                permutations.add(newPermutation);
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        System.out.println(generatePermutations("ABC"));
    }
}
