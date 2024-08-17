package org.example.livecodingtasks;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcbaXabcba"));
        System.out.println(isPalindrome("12321"));
        System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));
        System.out.println(isPalindrome("Aba"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome(""));
    }

    public static boolean isPalindrome(String word) {
        word = word.trim().toLowerCase();
        char[] array = word.toCharArray();
        StringBuilder reversedWord = new StringBuilder();
        for(int i = array.length - 1; i >= 0; i--) {
            reversedWord.append(array[i]);
        }
        return reversedWord.toString().equals(word);
    }
}
