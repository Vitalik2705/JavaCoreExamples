package org.example.livecodingtasks;

public class StringReverse {
    public static String reverseString(String str) {
        StringBuilder newStr = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
