package org.example.livecodingtasks;

public class DetectCapital {
    public static boolean detectCapital(String word) {
        int amountOfUpperCaseLetters = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) amountOfUpperCaseLetters += 1;
        }

        return amountOfUpperCaseLetters == word.length() ||
                amountOfUpperCaseLetters == 0 ||
                amountOfUpperCaseLetters == 1 && Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(detectCapital("USA"));
        System.out.println(detectCapital("Ukraine"));
        System.out.println(detectCapital("amazing"));
        System.out.println(detectCapital("amazinG"));
    }
}
