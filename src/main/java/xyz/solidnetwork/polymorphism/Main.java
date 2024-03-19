package xyz.solidnetwork.polymorphism;

public class Main {
    public static void main(String[] args) {
        ClothingPoly[] items = new ClothingPoly[2];
        items[0] = new Tailored(10, 1);
        items[1] = new Standard(5);
        for (ClothingPoly item : items) {
            System.out.println(item.getPrice());
        }

        ClothingPoly item = new Standard(7);
        System.out.println(item.getPrice());
        Standard sItem = (Standard) item;
        System.out.println(sItem.getPrice());
    }
}
