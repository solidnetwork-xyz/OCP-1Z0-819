package com.prottonne;

import com.prottonne.animal.*;

import java.util.Scanner;
import java.util.Arrays;

import com.prottonne.toy.*;
import com.prottonne.statics.*;
import com.prottonne.polymorphism.*;
import com.prottonne.interfaces.*;

//TODO: SpringBootApplication annotation
public class MainApplication {

    public static int getOption() {
        //TODO: change console input to REST controller
        System.out.print("Enter your option please: ");
        Scanner consoleReader = new Scanner(System.in);
        return consoleReader.nextInt();
    }

    public static void main(String[] args) {
        //TODO: SpringApplication initialization

        int optionSelected = getOption();

        switch (optionSelected) {
            case 1:
                interfaces();
                break;
            case 2:
                dogFetch();
                break;
            case 3:
                catFetch();
                break;
            case 4:
                playWithToys();
                break;
            case 5:
                arrays();
                break;
            case 6:
                doubleInitialization();
                break;
            case 7:
                staticCall();
                break;
            case 8:
                exceptionFlow(new RuntimeException("This is an unchecked exception"));
                break;
            case 9:
                polymorphism();
                break;
            default:
                //TODO: change println to slf4j
                System.out.println("out of options");
        }

    }


    private static void dogFetch() {
        Animal dog = new Dog();
        dog.fetch();
    }

    private static void catFetch() {
        Animal cat = new Cat();
        cat.fetch();
    }

    private static void playWithToys() {

        Toy[] myToys = new Toy[3];
        myToys[0] = new Ball();
        myToys[1] = new Squeaky();
        myToys[2] = new Shoe();

        Dog dog = new Dog();
        dog.setFavoriteToy(myToys[0]);
        dog.fetch();
        dog.setFavoriteToy(myToys[1]);
        dog.fetch();
        dog.setFavoriteToy(myToys[2]);
        dog.fetch();
    }

    private static void arrays() {
        String[] aString = {"St1", "St2", "St3"};
        int[] aInt = {1, 2, 3};
        System.out.println(aString);
        System.out.println(aInt);

        String[] aString2 = new String[3];
        int[] aInt2 = new int[16];
        System.out.println(aString2);
        System.out.println(aInt2);
    }

    private static void doubleInitialization() {
        double someDouble = 32.16;
        System.out.println(someDouble);
        someDouble = 32.16d;
        System.out.println(someDouble);
        someDouble = 32.16D;
        System.out.println(someDouble);
        someDouble = 2.1E12;
        System.out.println(someDouble);
        someDouble = 75; //Becomes 75.0
        System.out.println(someDouble);
        someDouble = .3;
        System.out.println(someDouble);
        someDouble = 4.0f;
        System.out.println(someDouble);
    }

    private static void staticCall() {
        Clothing cloth = new Clothing();
        HatMaker.toHat(cloth);
    }

    private static void exceptionFlow(RuntimeException rException) {
        try {
            System.out.println("Exception is thrown");
            throw rException;
        } catch (Exception e) {
            System.out.println("Exception is handled here");
        }
        System.out.println("execution continues here");
    }

    private static void polymorphism() {
        ClothingPoly[] items = new ClothingPoly[2];
        items[0] = new Tailored(10, 1);
        items[1] = new Standard(5);
        for (ClothingPoly item : items) {
            System.out.println(item.getPrice());
        }

        ClothingPoly item = new Standard(7);
        System.out.println(item.getPrice());
    }

    private static void interfaces() {
        System.out.println(IService.myStaticMethod());
        System.out.println(IService.MY_STATIC_CONSTANT);

        IService service = new MyService();

        System.out.println(service.myDefaultMethod());

        service.myAbstractMethod();

        Recyclable[] rubbish = new Recyclable[3];
        rubbish[0] = new Bottle(3);
        rubbish[1] = new Bottle(1);
        rubbish[2] = new Bottle(4);

        for (Recyclable item : rubbish) {
            item.recycle();
        }

        Arrays.sort(rubbish);

        for (Recyclable item : rubbish) {
            item.recycle();
        }

    }
}
