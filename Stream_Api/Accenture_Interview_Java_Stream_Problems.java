package Stream_Api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Accenture_Interview_Java_Stream_Problems {

    static List<Integer> numbers = List.of(1,2,3,4,5,6,6,7,4,8,13,25,3,12);

    static List<String> names = List.of("Lokesh", "Ravi", "Kiran", "Anil");

    public static void main(String[] args){

        //1. Find all even numbers from a list.
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        //2. Convert a list of strings to uppercase.
        List<String> upperCase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCase);

        //3. Find numbers greater than 10.
        List<Integer> greaterThan10 = numbers.stream()
                .filter(num -> num > 10)
                .collect(Collectors.toList());
        System.out.println(greaterThan10);

        //4. Find the first element in the list.
        Optional<Integer> firstElement = numbers.stream()
                .findFirst();
        System.out.println(firstElement);

        //5. Count how many strings start with letter ‘A’.
        long countOfAletterStrings = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(countOfAletterStrings);

        //6. Sort a list of integers in ascending order.
        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ascendingOrder);

        //7. Sort a list of integers in descending order.
        List<Integer> descendingOrder = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descendingOrder);

        //8. Remove duplicates from a list.
        List<Integer> removeDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removeDuplicates);

        //9. Find the maximum number in a list.
        Optional<Integer> maximumNumber = numbers.stream()
                .max(Integer::compareTo);

        System.out.println(maximumNumber);

        //10. Find the minimum number in a list.
        Optional<Integer> minimumNumber = numbers.stream()
                .min(Integer::compareTo);

        System.out.println(minimumNumber);

        //11. Find the sum of all elements in a list.

    }



}
