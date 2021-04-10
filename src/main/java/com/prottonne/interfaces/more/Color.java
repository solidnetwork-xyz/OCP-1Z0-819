package com.prottonne.interfaces.more;

public class Color implements Black, Red, Gold {
    public static void main(String[] args) {
        Color color = new Color();
        color.getColor();
    }
}
