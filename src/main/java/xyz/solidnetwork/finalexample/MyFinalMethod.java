package xyz.solidnetwork.finalexample;

public class MyFinalMethod {

    @Override
    public final String toString() {
        System.out.println(super.toString());
        return "toString is final now";
    }
}
