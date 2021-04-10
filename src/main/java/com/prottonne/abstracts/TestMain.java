package com.prottonne.abstracts;

public class TestMain {

    public static void main(String[] args) {
        TestConcrete testConcrete = new TestConcrete();
        System.out.println(testConcrete.calculateTax(36));
        System.out.println(testConcrete.calculateTax());
    }
}
