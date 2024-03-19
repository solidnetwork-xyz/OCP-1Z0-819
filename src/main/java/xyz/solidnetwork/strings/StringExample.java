package xyz.solidnetwork.strings;

public class StringExample {
    public static void main(String[] args) {
       String immutableString = "This is immutable";
       StringBuilder mutableString = new StringBuilder("This is mutable");

        System.out.println(mutableString.length());
        System.out.println(mutableString.charAt(3));
        System.out.println(mutableString.indexOf("i"));
        System.out.println(mutableString.lastIndexOf("i"));
        System.out.println(mutableString.substring(4));

    }
}
