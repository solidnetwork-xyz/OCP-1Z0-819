package com.amazon.animal;

import com.amazon.toy.*;

public class Dog extends Animal implements IAnimal{

    private Toy favoriteToy;

    public void setFavoriteToy(Toy toy){
        this.favoriteToy = toy;
    }

    @Override
    public void fetch(){
        //TODO: change println to slf4j
        System.out.println("I'm a dog, I'm fetching this toy");

        if(null!=favoriteToy){
            favoriteToy.play();
        }
    }
}
