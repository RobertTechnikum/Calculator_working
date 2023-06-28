package com.example.Calculator.MathService;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int getAddition(int num1, int num2){
        return num1 + num2;
    }

    public int getMultiplication(int num1, int num2){
        return num1 * num2;
    }


    public double getDivision(double num1, double num2){
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
    }


}
