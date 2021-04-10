package com.prottonne.interfaces;

public interface IService extends ISuperService {
    int MY_STATIC_CONSTANT = 15; // a constant, static and final

    void myAbstractMethod(); // this is public and abstract method

    private String myConcreteMethod() { // this is a private concrete method
        return "I would be call by default method";
    }

    default String myDefaultMethod() { // this is a public default method
        return myConcreteMethod();
    }

    static int myStaticMethod() { // this is a static
        return MY_STATIC_CONSTANT;
    }

    private static String myPrivateStaticMethod() {
        return "all static are concrete";
    }
}
