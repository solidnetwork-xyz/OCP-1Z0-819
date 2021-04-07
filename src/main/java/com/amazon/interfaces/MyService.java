package com.amazon.interfaces;

public class MyService implements IService {

    @Override
    public void myAbstractMethod() {
        System.out.println(IService.super.myDefaultMethod());
    }

    @Override
    public String myDefaultMethod() {
        return "Override default method";
    }

    @Override
    public void mySuperMethod() {
        System.out.println("this is a method from a super interface");
    }
}