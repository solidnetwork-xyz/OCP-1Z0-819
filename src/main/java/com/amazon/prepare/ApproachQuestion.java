package com.amazon.prepare;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class ApproachQuestion {

    public static void main(String[] args) {
        System.out.print("Enter you option please: ");
        Scanner input = new Scanner(System.in);
        final int option = input.nextInt();

        switch (option) {
            case 1:
                forStatement();
                break;
            case 2:
                functionsAndLambdas();
                break;
            default:
                System.out.println("Option unavailable");
        }
    }

    private static void forStatement() {
        int i = 0;
        for (; ; ) {
            if (i >= 5)
                break;

            System.out.println(i);
            i++;
        }

        int idx;
        for (idx = 0; ; ) {
            if (idx >= 5)
                break;

            System.out.println(idx);
            idx++;
        }
    }

    public static void functionsAndLambdas() {
        Supplier<String> hello = () -> "Hello";

        System.out.println(hello.get());

        BiPredicate<Integer, Integer> myBi = (x, y) -> x == y;

        System.out.println(myBi.test(4, 4));

    }

}
