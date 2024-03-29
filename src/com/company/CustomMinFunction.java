package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int []numbers =   Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[],Integer>minNumber = number ->{
           int min= Arrays.stream(number).min().getAsInt();

          return min;

        };
        System.out.println(minNumber.apply(numbers));
    }
}
