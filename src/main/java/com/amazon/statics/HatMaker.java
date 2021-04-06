package com.amazon.statics;

public class HatMaker {

    private static int nextHat;
    private int hatID;

    public static void toHat(Clothing cloth) {
        System.out.println(cloth.getDescription());
        System.out.println(nextHat);
        System.out.println(nextHat++);
        System.out.println(nextHat);
        System.out.println(Math.pow(2, 5));
    }


}
