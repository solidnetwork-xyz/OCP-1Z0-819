package com.amazon;

import com.amazon.animal.*;
import com.amazon.interfaces.*;
import java.util.Scanner;
import com.amazon.toy.*;

//TODO: SpringBootApplication annotation
public class MainApplication {

    public static int getOption(){
        //TODO: change console input to REST controller
        System.out.print("Enter your option please: ");
        Scanner consoleReader =  new Scanner(System.in);
        return consoleReader.nextInt();
    }

    public static void main(String[] args){
        //TODO: SpringApplication initialization

        final int optionSelected = getOption();

        switch(optionSelected){
            case 1: multipleImplementationExample();
            break;
            case 2: dogFetch();
            break;
            case 3: catFetch();
            break;
            case 4: playWithToys();
            break;
            default:
                //TODO: change println to slf4j
                System.out.println("out of options");
        }

    }

    private static void multipleImplementationExample(){
        //TODO: change println to slf4j
        System.out.println("before calling dogService");
        //TODO: change new to @Autowired
        IDogService dogServiceManager = new DogServiceServiceManager();
        ResponseDto dogServiceManagerResponse = dogServiceManager.play();
        //TODO: change println to slf4j
        System.out.println("after calling dogServiceManager " + dogServiceManagerResponse);
        //TODO: change new to @Autowired
        IDogService dogServiceProcessor = new DogServiceServiceProcessor();
        ResponseDto dogServiceProcessorResponse = dogServiceProcessor.play();
        //TODO: change println to slf4j
        System.out.println("after calling dogServiceProcessor " + dogServiceProcessorResponse);
    }

    private static void dogFetch(){
        IAnimal dog = new Dog();
        dog.fetch();
    }

    private static void catFetch(){
        IAnimal cat = new Cat();
        cat.fetch();
    }

    private static void playWithToys(){
        Dog dog = new Dog();
        dog.setFavoriteToy(new Ball());
        dog.fetch();
        dog.setFavoriteToy(new Squeaky());
        dog.fetch();
        dog.setFavoriteToy(new Shoe());
        dog.fetch();
    }
}
