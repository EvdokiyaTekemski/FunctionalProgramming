package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String [] checkList = scanner.nextLine().split(" ");
        Predicate<String> predicate =words-> Character.isUpperCase(words.charAt(0));

        List<String> printWords = new ArrayList<>();
        for (int i = 0; i <checkList.length; i++) {
            if(predicate.test(checkList[i])){
                printWords.add(checkList[i]);

            }

        }
        System.out.println(printWords.stream().count());
        printWords.stream().forEach(e-> System.out.println(e));

    }
}
