package com.amazon.service.impl;

import com.amazon.service.IDogService;
import com.amazon.dto.ResponseDto;

// TODO: Service annotation
public class DogServiceServiceProcessor implements IDogService {

    @Override
    public ResponseDto play(){
        return new ResponseDto("1");
    }
}
