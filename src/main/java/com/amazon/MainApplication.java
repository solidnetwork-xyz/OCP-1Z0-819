package com.amazon;

import com.amazon.service.IDogService;
import com.amazon.dto.ResponseDto;
import com.amazon.service.impl.DogServiceServiceManager;
import com.amazon.service.impl.DogServiceServiceProcessor;
import java.util.Scanner;

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
}
