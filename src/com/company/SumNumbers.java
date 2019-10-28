package com.company;

import java.io.PrintStream;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");

        Function<String, Integer> function = Integer::parseInt;

        List<Integer> numbers =Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());

        System.out.printf("Count = %s",numbers.size());
        System.out.println();
         System.out.printf("Sum = %d", numbers.stream().mapToInt(e->e).sum());
    }

    }
