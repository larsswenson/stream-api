import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().forEach(System.out::println);

        // Filter out even numbers
        System.out.println("Even numbers: ");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Map numbers to their squares 
        System.out.println("Squared values: ");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);

        // Filter out odd numbers and map them to their cubes
        System.out.println("Cubed odd numbers: ");
        numbers.stream()
               .filter(n -> n % 2 != 0)
               .map(n -> n * n * n)
               .forEach(System.out::println);

        // Sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        // New list of even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Flatten lists into single list
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        List<Integer> flatList = listOfLists.stream()
                                            .flatMap(List::stream)
                                            .collect(Collectors.toList());
        System.out.println("Flattened list: " + flatList);

        // Group numbers by even & odd
        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
                                                              .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("Grouped by even and odd: " + groupedByEvenOdd);

        // Person class & objects
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<Person> people = Arrays.asList(
            new Person("Cynthia", 42),
            new Person("Atticus", 22),
            new Person("Kamali", 30),
            new Person("Balthazar", 43)
        );

        // Filter out > 25 
        System.out.println("People older than 25: ");
        people.stream()
              .filter(p -> p.getAge() > 25)
              .map(Person::getName)
              .forEach(System.out::println);

        // Find oldest person
        Optional<Person> oldestPerson = people.stream()
                                              .max(Comparator.comparingInt(Person::getAge));
        oldestPerson.ifPresent(p -> System.out.println("Oldest person: " + p.getName() + ", age " + p.getAge()));
    }
}
