package xyz.solidnetwork.interfaces;

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
        return (id == other.id) ? 0 : (id > other.id) ? 1 : -1;
    }


}
