package Stream_Api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_Practice_Problems {

    public static void main(String[] args){

        //1. Filter even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);

        //2. Convert list of strings to uppercase
        List<String> names = Arrays.asList("john", "doe");
        List<String> uppercase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercase);

        //3. Count elements greater than a threshold
        long count = numbers.stream()
                .filter(number -> number > 3)
                .count();
        System.out.println(count);

        //4. Sort list of strings alphabetically
        List<String> sorted = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

        //5. Remove duplicate elements
        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        //6. Count Occurrences of a Word
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        long countOccurrences = words.stream()
                .filter(word -> word.equals("apple"))
                .count();
        System.out.println(countOccurrences);

        //7. Find Maximum Number
        List<Integer> inputNumbers = Arrays.asList(1, 4, 2, 9, 3);
        Optional<Integer> maximum = inputNumbers.stream()
                .max(Integer::compareTo);
        System.out.println(maximum);


    }
}
