package org.example.livecodingtasks;

import java.util.List;

public class CalculateVowels {
    public static int calculateVowels(String str) {
        int result = 0;
        List<Character> vowels = List.of('a', 'o', 'e', 'i', 'u');
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))) result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateVowels("hello world"));
        System.out.println(calculateVowels("forget about world for a while"));
    }
}
