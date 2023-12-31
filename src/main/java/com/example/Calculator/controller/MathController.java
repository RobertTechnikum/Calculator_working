package com.example.Calculator.controller;

import com.example.Calculator.MathService.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/add")
    public int addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return mathService.getAddition(num1, num2);
    }

    @GetMapping("/multiply")
    public int multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return mathService.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public double divideNumbers(@RequestParam("num1")double num1, @RequestParam("num2") double num2){
        return mathService.getDivision(num1, num2);
    }

    @GetMapping("/*")
    public String getMessage() {
        return "Ready for use";
    }

}
