package com.amazon.interfaces;

// TODO: Service annotation
public class DogServiceServiceProcessor implements IDogService {

    @Override
    public ResponseDto play(){
        return new ResponseDto("1");
    }
}
