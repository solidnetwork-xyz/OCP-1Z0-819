package com.amazon.interfaces;

public class ResponseDto {
    private String code;

    public ResponseDto(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    @Override
    public String toString(){
        return "ResponseDto{code="+code+"}";
    }
}
