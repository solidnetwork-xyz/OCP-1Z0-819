package com.amazon;

import com.amazon.service.IDog;
import com.amazon.dto.ResponseDto;
import com.amazon.service.impl.DogServiceManager;
import com.amazon.service.impl.DogServiceProcessor;

//TODO: SpringBootApplication annotation
public class MainApplication {

    public static void main(String[] args){
        //TODO: SpringApplication initialization

        //TODO: change println to slf4j
        System.out.println("before calling dogService");
        //TODO: change new to @Autowired
        IDog dogServiceManager = new DogServiceManager();
        ResponseDto dogServiceManagerResponse = dogServiceManager.play();
        //TODO: change println to slf4j
        System.out.println("after calling dogServiceManager " + dogServiceManagerResponse);
        //TODO: change new to @Autowired
        IDog dogServiceProcessor = new DogServiceProcessor();
        ResponseDto dogServiceProcessorResponse = dogServiceProcessor.play();
        //TODO: change println to slf4j
        System.out.println("after calling dogServiceProcessor " + dogServiceProcessorResponse);
    }
}
