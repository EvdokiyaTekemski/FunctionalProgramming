package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String [] words = scanner.nextLine().split("\\s+");

       Consumer<String> word = name-> System.out.println(name);

        Arrays.stream(words).forEach(word);
        }
    }

