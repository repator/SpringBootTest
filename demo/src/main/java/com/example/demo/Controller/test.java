package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/order")
    String  index(){
        return "hellozhangzhengminhahahaha";
    }
}
