package com.shop.common.controller;


import com.shop.result.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class TestController {
    @GetMapping("/aaa")
    public String testHelloWorld(){
        return "3333333333333";
    }
}
