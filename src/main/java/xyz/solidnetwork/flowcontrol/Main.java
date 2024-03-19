package xyz.solidnetwork.flowcontrol;

public class Main {
    public static void main(String[] args) {

        int myVar = 1;

        while (myVar < 60) {

            if (myVar > 30)
                System.out.println("myVar > 30, myVar: " + myVar);
            else
                System.out.println("myVar < 30, myVar:" + myVar);

            myVar += 11;
        }


        while (myVar++ < 70)
            System.out.println("myVar < 70, myVar: " + myVar);
    }
}
