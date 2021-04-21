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

package com.prottonne.lambdas;

import java.util.*;

public class Main {

    private FuncInterface<Integer, Double> lambda = x -> 2.0 * x;

    public void callAbstractMethod() {
        System.out.println(lambda.abstractMethod(3));
    }

    public void changeLambda(FuncInterface aLambda) {
        this.lambda = aLambda;
    }

    public static void main(String[] args) {

        FuncInterface<Integer, Double> newLambda = x -> 3.0 * x;

        Main myMain = new Main();
        myMain.callAbstractMethod();
        myMain.changeLambda(newLambda);
        myMain.callAbstractMethod();

        List<String> names = Arrays.asList("Annie", "Carlos", "Jose", "Isidora");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String name : names) {
            System.out.println(name);
        }

        Collections.sort(names, (o1, o2) -> o2.length() - o1.length());

        for (String name : names) {
            System.out.println(name);
        }

    }
}
