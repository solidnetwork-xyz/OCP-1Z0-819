package com.amazon;

public class Dog extends Animal implements IAnimal{
    @Override
    public void fetch(){
        //TODO: change println to slf4j
        System.out.println("I'm a dog, I'm fetching this toy");
    }
}
