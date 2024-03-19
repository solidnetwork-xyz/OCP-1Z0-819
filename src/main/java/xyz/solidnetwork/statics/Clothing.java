package xyz.solidnetwork.statics;

public class Clothing {
    private String description;
    public static final int MIN_PRICE = 54;
    public final static int MAX_PRICE = 80;

    public String getDescription() {
        if(MIN_PRICE<MAX_PRICE){
            System.out.println("MIN_PRICE<MAX_PRICE");
        }
        return description;
    }
}
