package com.example.Calculator.MathService;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int getAddition(int num1, int num2){
        return num1 + num2;
    }

}
