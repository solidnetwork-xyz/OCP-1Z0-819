package com.prottonne.interfaces.more;

public interface Black {
    default void getColor() {
        System.out.println(
                "Black"
        );
    }
}
