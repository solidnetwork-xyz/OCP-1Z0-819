package com.prottonne.lambdas;

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
    }
}
