package com.amazon;

public abstract class Animal {
    private String name;

    public Animal(){
        super();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void fetch();
}
