package com.prottonne.interfaces;

public class ClothingImpl implements Recyclable {


    @Override
    public void recycle() {
        System.out.println("I'm recycling some cloth");
    }


}
