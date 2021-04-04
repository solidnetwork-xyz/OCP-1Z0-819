package com.amazon.service;

import com.amazon.service.IDogService;
import com.amazon.service.ResponseDto;

// TODO: Service annotation
public class DogServiceServiceManager implements IDogService {

    @Override
    public ResponseDto play(){
        return new ResponseDto("0");
    }
}
