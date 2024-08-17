package org.example.livecodingtasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamAPITasks {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(elem -> elem % 2 == 0).toList();
        System.out.println(evenNumbers);

        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
        String word = String.valueOf(words.stream().filter(elem -> elem.toLowerCase().startsWith("c")).findFirst());
        System.out.println(word);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
        Integer squareSum = numbers2.stream().mapToInt(num -> num * num).sum();
        System.out.println(squareSum);

        List<String> words2 = Arrays.asList("hello", "world", "java", "stream");
        List<String> upperCasedWords = words2.stream().map(String::toUpperCase).toList();
        System.out.println(upperCasedWords);

        List<Integer> numbers3 = Arrays.asList(3, 5, 7, 2, 8, 1);
        OptionalInt maxNum = numbers3.stream().mapToInt(n -> n).max();
        System.out.println(maxNum);

        List<String> words3 = Arrays.asList("apple", "banana", "kiwi", "strawberry", "grape");
        List<String> wordsWithFiveLetters = words3.stream().filter(elem -> elem.length() > 5).toList();
        System.out.println(wordsWithFiveLetters);

        List<String> words4 = Arrays.asList("apple", "banana", "cherry");
        String result = words.stream()
                .collect(Collectors.joining(","));
        System.out.println(result);

        List<String> words5 = Arrays.asList("one", "two", "three", "four", "five");
        Map<Integer, List<String>> groupedByLength = words5.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);

        List<Integer> numbers4 = Arrays.asList(3, 5, 1, 4, 2);
        List<Integer> sortedNumbers = numbers4.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List<Integer> numbers5 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinct = numbers5.stream().distinct().toList();
        System.out.println(distinct);
    }
}
