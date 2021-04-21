/*
 * MIT License
 *
 * Copyright (c)  2021 Jose Osuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.prottonne.prepare;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

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
            case 3:
                someStream();
                break;
            case 4:
                typeInference();
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

        UnaryOperator<Integer> unaOp2 = (var x) -> x * 7;
        UnaryOperator<Integer> unaOp3 = (x) -> x * 7;
        IntUnaryOperator unaOp6 = (x) -> x * 1;

        System.out.println(unaOp2.apply(3));
        System.out.println(unaOp3.apply(2));
        System.out.println(unaOp6.applyAsInt(7));

    }

    public static void someStream() {
        System.out.println(pickNameOptional());
        System.out.println(pickNameString());
    }

    public static Optional pickNameOptional() {
        List<String> names = List.of("Barclay", "Barry", "Bert", "Bort");
        /* line 1 */
        return names.stream().
                filter(n -> n.contains("Bart"))
                .findAny()
                /* line 2*/;
    }

    public static String pickNameString() {
        List<String> names = List.of("Barclay", "Barry", "Bert", "Bort");
        /* line 1 */
        return names.stream().
                filter(n -> n.contains("Bart"))
                .findAny().
                        orElse("Not Found");
    }

    public static void typeInference() {
        var outputStream = new ByteArrayOutputStream();
        UnaryOperator<Integer> unaOp2 = (var x) -> x * 7;

        try (var inputStream = System.in;
             var reader = new InputStreamReader(inputStream, Charset.defaultCharset());
             var bufReader = new BufferedReader(reader)) {

            bufReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        var x = 30;

        var var = 10;
    }

}
