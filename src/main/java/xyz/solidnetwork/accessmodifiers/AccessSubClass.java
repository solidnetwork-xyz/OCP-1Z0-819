package xyz.solidnetwork.accessmodifiers;

import xyz.solidnetwork.accessmodifiers.other.AccessClass;

public class AccessSubClass extends AccessClass {
    public static void main(String[] args) {
        AccessSubClass accessClass = new AccessSubClass();
        System.out.println(accessClass.protectedField);
        System.out.println(accessClass.publicField);

    }
}
