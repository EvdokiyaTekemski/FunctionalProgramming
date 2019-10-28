package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ADDVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> vat = value ->value * 1.20;
         double [] input =Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        ArrayList<Double> vatIn = new ArrayList<>();
        for (int i = 0; i <input.length ; i++) {
            vatIn.add(vat.apply(input[i]));
        }

        System.out.println("Prices with VAT:");
vatIn.forEach(e-> System.out.printf("%.2f%n",e));
    }
}
