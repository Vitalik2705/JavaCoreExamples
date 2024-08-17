package org.example.livecodingtasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(areAnagrams("ara", "raa"));
        System.out.println(areAnagrams("araa", "raa"));
        System.out.println(areAnagrams("araa", "raar"));
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
            list2.add(str2.charAt(i));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
