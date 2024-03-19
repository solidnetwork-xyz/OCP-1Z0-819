package xyz.solidnetwork.lambdas;

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

        List<String> names = Arrays.asList("Annie", "Charlie", "James", "Jess");

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
