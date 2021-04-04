package com.amazon.interfaces;

// TODO: Service annotation
public class DogServiceServiceManager implements IDogService {

    @Override
    public ResponseDto play(){
        return new ResponseDto("0");
    }
}
