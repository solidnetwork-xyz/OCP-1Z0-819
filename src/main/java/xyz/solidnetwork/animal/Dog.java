package xyz.solidnetwork.animal;

import xyz.solidnetwork.toy.*;

public class Dog extends Animal {

    private Toy favoriteToy;

    public void setFavoriteToy(Toy toy) {
        this.favoriteToy = toy;
    }

    public void fetch() {
        //TODO: change println to slf4j
        System.out.println("I'm a dog, I'm fetching this toy");

        if (null != favoriteToy) {
            favoriteToy.play();
        }
    }
}
