package com.amazon.interfaces;

public class ClothingImpl implements Recyclable {


    @Override
    public void recycle() {
        System.out.println("I'm recycling some cloth");
    }


}
