package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> word = names -> System.out.println("Sir" + " "+ names);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(word);
    }
}
