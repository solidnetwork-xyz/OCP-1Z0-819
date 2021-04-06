package com.amazon.prepare;

import java.util.Scanner;

public class ApproachQuestion {

    public static void main(String[] args) {
        System.out.print("Enter you option please: ");
        Scanner input = new Scanner(System.in);
        final int option = input.nextInt();

        switch (option) {
            case 1:
                forStatement();
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

}
