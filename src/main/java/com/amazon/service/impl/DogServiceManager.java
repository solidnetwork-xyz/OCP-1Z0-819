package com.amazon.service.impl;

import com.amazon.service.IDog;
import com.amazon.dto.ResponseDto;

// TODO: Service annotation
public class DogServiceManager implements IDog {

    @Override
    public ResponseDto play(){
        return new ResponseDto("0");
    }
}
