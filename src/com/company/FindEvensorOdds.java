package com.company;

import java.lang.ref.PhantomReference;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] number = scanner.nextLine().split(" ");
        int  first = Integer.parseInt(number[0]);
        int last = Integer.parseInt(number[1]);
        String command = scanner.nextLine();

        Predicate<Integer> condition = null;
        if(command.equals("even")){
            condition=n-> n % 2 == 0;
        }else {
            condition= n -> n % 2 != 0;
        }
        IntStream.range(first,last+1).boxed().
                filter(condition).
                forEach(e-> System.out.print(e + " "));


    }
}
