package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine()
                .split(", ")).map(s->Integer.parseInt(s)).filter(e->e%2==0).collect(toList());
evenNumbers.forEach(e-> System.out.print(e + ", "));
        System.out.println();
evenNumbers.stream().sorted(Integer::compareTo).forEach(e-> System.out.print(e));
    }
}
