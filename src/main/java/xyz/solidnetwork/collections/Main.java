package xyz.solidnetwork.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        myInts.add(null);

        Set<Integer> mySetInts = new HashSet<>();
        myInts.add(null);

        for (Integer myInt : myInts){
            System.out.println(myInt);
        }

        for (Integer mySetInt : mySetInts){
            System.out.println(mySetInt);
        }
    }
}
