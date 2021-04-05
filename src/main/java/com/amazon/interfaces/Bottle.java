package com.amazon.interfaces;

public class Bottle implements Recyclable, Comparable<Bottle> {

    private int id;

    public Bottle(int aId) {
        this.id = aId;
    }

    @Override
    public void recycle() {
        System.out.println("I'm recycling some bottle. Id: " + id);
    }


    @Override
    public int compareTo(Bottle other) {
        return (other.id == id) ? 0 : (other.id < id) ? 1 : -1;
    }


}
