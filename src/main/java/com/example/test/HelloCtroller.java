package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCtroller {
    @RequestMapping("/hello")
    @ResponseBody
    public String toString() {
        return "hello word";
    }
}
