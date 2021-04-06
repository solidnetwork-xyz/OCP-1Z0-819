package com.amazon.interfaces;

public interface IService {
    int MAX_PRICE = 15; // a constant, static and final

    void call(); // this is public and abstract method

    private String concreteMethod() { // this is a private concrete method
        return "I can't believe this";
    }

    default String staticMethod() { // this is a default method
        return concreteMethod();
    }

    static int getMaxPrice() { // this is a static
        return MAX_PRICE;
    }


}
