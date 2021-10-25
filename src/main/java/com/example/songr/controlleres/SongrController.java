package com.example.songr.controlleres;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongrController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
