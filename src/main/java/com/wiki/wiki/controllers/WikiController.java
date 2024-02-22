package com.wiki.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WikiController {

    @GetMapping("/grupo13/home")
    public String home(){
         return "index.html";
     }
    
}
