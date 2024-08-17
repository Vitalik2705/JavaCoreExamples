package org.example.livecodingtasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRepeatedCharacterCheck {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("hello"));
        System.out.println(firstNonRepeatedCharacter("hheello"));
    }

    public static Character  firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }

        return null;
    }
}
