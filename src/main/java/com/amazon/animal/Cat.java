package com.amazon.animal;

public class Cat extends Animal implements IAnimal{

    @Override
    public void fetch(){
        System.out.println("I'm a cat. I'm fetching this toy.");
    }
}
