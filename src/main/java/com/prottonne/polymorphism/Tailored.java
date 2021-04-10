package com.prottonne.polymorphism;

public class Tailored extends ClothingPoly {
    private double fee;

    public Tailored(double aPrice, double aFee) {
        super(aPrice);
        this.fee = aFee;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + fee;
    }
}
