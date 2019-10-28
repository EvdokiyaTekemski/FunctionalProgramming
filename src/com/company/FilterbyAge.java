package com.company;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;


public class FilterbyAge {
    public static void main(String[] args) {

        BiPredicate<Map.Entry<String, Integer>, Integer> youngerThen;
        youngerThen = (person, ageLimit) -> person.getValue() <= ageLimit;

        BiPredicate<Map.Entry<String, Integer>, Integer> olderThan =
                (person, ageLimit) -> person.getValue() >= ageLimit;

        Consumer<Map.Entry<String, Integer>> printName = person -> System.out.println(person.getKey());
        Consumer<Map.Entry<String, Integer>> printnAge = person -> System.out.println(person.getValue());
        Consumer<Map.Entry<String, Integer>> printnNameandAge = person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String[] personData = scanner.nextLine().split(", ");
            people.put(personData[0], Integer.parseInt(personData[1]));

        }
        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printTipe = scanner.nextLine();

        people.entrySet().stream().filter(per ->
                comparison.equals("younger") ?
                        youngerThen.test(per, ageLimit) :
                        olderThan.test(per, ageLimit)
        )
                .forEach(person -> {
                    if (printTipe.equals("age")) {
                        printnAge.accept(person);
                    } else if (printTipe.equals("name")) {
                        printName.accept(person);
                    } else {
                        printnNameandAge.accept(person);
                    }
                });

    }
}